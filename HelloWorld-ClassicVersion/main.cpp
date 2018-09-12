#include <iostream>
#include <string>
#include "myFunctions.h"

using namespace std;

int main() {
	string name;
	cout << "Nombre: ";
	cin >> name;
	sayHello(name);
	return 0;
}

