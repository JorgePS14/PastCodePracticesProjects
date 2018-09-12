#include <iostream>
#include <string>

using namespace std;

// Polynomial representation
// P(x) = a0 + a1x + a2x^2+...+anx^n
// n - Polynomial's order

// Return Polynomial as string
string polyToString(double *p, int n);

// P(x) / (x-a) = Q(x) + R / (x-a)
//Return Q(x)
double * divPolyByMonomial(double *p, int n, double a, double &reminder);

int main()
{
	int n;		// Polynomail's order	
	double *p;	// P(x)
	double *q;	// Q(x)
	double a;	// x - a
	double r;	// R
				// data
	n = 4;
	p = new double[n + 1];
	// P(x) = 24-10x-15x^2+x^4=0
	p[0] = 24.;
	p[1] = -10.;
	p[2] = -15.;
	p[3] = 0.;
	p[4] = 1.;
	a = -4;

	cout << "P(x) = " << polyToString(p, n) << " = 0" << endl;
	q = divPolyByMonomial(p, n, a, r);
	cout << "Q(x) = " << polyToString(q, n - 1) << " = 0" << endl;
	cout << "R = " << r << endl;
	system("pause");
	delete[] p;
	delete[] q;
	return 0;
}

// pre: n>=0
string polyToString(double *p, int n)
{
	string msg = "";
	for (int i = 0; i <= n; i++)
	{
		msg = msg + to_string(p[i]) + "x^" + to_string(i) + " + ";
	}
	return msg;
}


double * divPolyByMonomial(double *p, int n, double a, double &reminder) {
	double *q = new double[n];

	q[0] = p[n];

	for (int i = 1; i < n; i++) {
		q[i] = q[i - 1] * a + p[n-i]; // Falta corregir algo aquí
	}

	reminder = q[n-1] * a + p[0];

	double *temp = new double[n];

	for (int i = 0; i < n; i++) {
		temp[i] = q[n - i - 1];
	}

	delete[] q;

	return temp;
}