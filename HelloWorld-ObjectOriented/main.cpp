#include <iostream>
#include <string>

using namespace std;

class Person {
	private:
		string name;
	public:
		Person() {
			this->name = "Blurryface";
		}
		
		Person(string name) {
			this->name = name;
		}

		void sayHello() {
			cout << "Hello World, I'm " << this->name << endl;
		}
};

int main() {
	string name;
	cout << "Nombre: ";
	cin >> name;
	Person p1(name);
	p1.sayHello();
	Person p2();
	p2.sayHello();
	system("pause");
	return 0;
}