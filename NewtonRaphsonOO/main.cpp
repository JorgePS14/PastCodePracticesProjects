#include <iostream>
#include <string>

using namespace std;

class Polynomial
{
private:
	int n;
	double *coef;
public:
	Polynomial()
	{
		this->n = 0;
		this->coef = new double[1];
		this->coef[0] = 0.;
	}
	Polynomial(int n, double *coef)
	{
		this->n = n;
		this->coef = new double[n + 1];
		for (int i = 0; i <= n; i++)
		{
			this->coef[i] = coef[i];
		}
	}
	~Polynomial()
	{
		delete[] this->coef;
	}

	double evaluate(double x) {
		double sum;
		sum = this->coef[0];
		for (int i = 1; i <= this->n; i++) {
			sum = sum + this->coef[i] * pow(x, i);
		}
		return sum;
	}

	Polynomial * derivative() {
		double * dp = new double[this->n];
		for (int i = 0; i < this->n; i++) {
			dp[i] = this->coef[i + 1] * (i + 1);
		}
		Polynomial *dPol = new Polynomial(this->n - 1, dp);
		delete[] dp;
		return dPol;
	}

	bool newtonRaphson(double x0, double tol, int iterMax, int &solutionType, double &xRoot, int &iter) {
		double x1, fx0, dfx0, en;
		Polynomial *dpol = this->derivative();

		for (int i = 1; i <= iterMax; i++) {
			fx0 = this->evaluate(x0);
			dfx0 = dpol->evaluate(x0);
			if (abs(dfx0) <= tol) {
				solutionType = 3;
				iter = i;
				return false;
			}
			x1 = x0 - fx0 / dfx0;
			en = abs((x1 - x0)*100. / x1);
			if (en <= tol) {
				xRoot = x1;
				iter = i;
				solutionType = 0;
				return true;
			}
			x0 = x1;
		}

		xRoot = x1;
		iter = iterMax;
		solutionType = 1;
		return false;
	}

	string toString()
	{
		string msg = "";
		for (int i = 0; i <= n; i++)
		{
			msg = msg + to_string(this->coef[i]) + "x^" + to_string(i) + " + ";
		}
		return msg;
	}

	Polynomial * divByMonomial(double a, double &reminder)
	{
		double *q = new double[this->n];
		q[0] = this->coef[this->n];
		for (int i = 1; i < this->n; i++)
		{
			q[i] = q[i - 1] * a + this->coef[this->n - i];
		}
		reminder = q[n - 1] * a + this->coef[0];
		double *temp = new double[this->n];
		for (int i = 0; i < this->n; i++)
		{
			temp[i] = q[n - i - 1];
		}
		delete[] q;
		Polynomial *polQ = new Polynomial(n - 1, temp);
		delete[] temp;
		return polQ;
	}
};

int main()
{
	int n;		// Polynomail's order	
	double *coef;	// P(x)
	Polynomial *p;
	double x0, tol, xRoot;
	int iterMax, solutionType, iter;
				// data
	n = 5;
	coef = new double[n + 1];
	
	coef[0] = -2.236;
	coef[1] = 2.;
	coef[2] = 0.;
	coef[3] = 0.;
	coef[4] = -2.236;
	coef[5] = 2.;
	x0 = 0.5l;
	tol = 0.000001;
	iterMax = 10000;

	p = new Polynomial(n, coef);

	cout << "P(x) = " << p->toString() << " = 0" << endl;

	if (p->newtonRaphson(x0, tol, iterMax, solutionType, xRoot, iter)) {
		cout << "Real root\nxRoot = " + to_string(xRoot) + " in " + to_string(iter) + " iteraciones.";
	}
	else {
		cout << "No real root. See solution type for more details." << endl;
	}

	system("pause");

	delete[] coef;
	delete p;
	return 0;
}