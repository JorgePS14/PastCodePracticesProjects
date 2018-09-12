#include <iostream>

using namespace std;

void sumRationals(const int &a, const int &b, const int &c, const int &d, int *const e, int *const f);
void printSumRational(const int &a, const int &b, const int &c, const int &d, const int &e, const int &f);

int main() {
	int a, b, c, d, e, f;

	a = 1;
	b = 2;
	c = 3;
	d = 4;
	e = 0;
	f = 0;

	sumRationals(a, b, c, d, &e, &f);
	printSumRational(a, b, c, d, e, f);
	return 0;
}

void sumRationals(const int &a, const int &b, const int &c, const int &d, int *const e, int *const f) {
	*e = (a*b + b * c) / (b*d);
	*f = b * d;
	a = 100;
}

void printSumRational(const int &a, const int &b, const int &c, const int &d, const int &e, const int &f) {
	cout << a << "*/" << b << "+" << c << "/" << d << " = " << e << "/" << f << endl;
}