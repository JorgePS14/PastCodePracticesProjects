#include <iostream>
#include <string>

using namespace std;

void sayHello(string name);  //prototipo de la funcion

int main() {
	string name;
	cout << "Nombre: ";
	cin >> name;
	sayHello(name);
	return 0;
}

void sayHello(string name) {
	cout << "Hello World from C++, greetings: " << name << endl;
	system("pause");
}