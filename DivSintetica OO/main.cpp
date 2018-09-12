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
	Polynomial *p, *q;
	double a;	// x-a
	double r;	// R
				// data
	n = 4;
	coef = new double[n + 1];
	// P(x) = 24-10x-15x^2+x^4=0
	coef[0] = 24.;
	coef[1] = -10.;
	coef[2] = -15.;
	coef[3] = 0.;
	coef[4] = 1.;
	a = -4;

	p = new Polynomial(n, coef);

	cout << "P(x) = " << p->toString() << " = 0" << endl;
	q = p->divByMonomial(a, r);
	cout << "Q(x) = " << q->toString() << " = 0" << endl;
	cout << "R = " << r << endl;
	delete[] coef;
	delete p;
	delete q;
	return 0;
}