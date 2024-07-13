#include <iostream>
using namespace std ;

class Complex {
	private:
		double num;
		double com;
	public:
		
		Complex()  {
			num = 0 ;
			com = 0 ;
		}

		
		Complex(double r, double i)  {
			
			num = r ;
			com = i ;
		}

	
		Complex operator+(const Complex &c) {
			return Complex(num + c.num, com + c.com);
		}

	
		Complex operator*(const Complex &c) {
			return Complex(num*c.num - com*c.com, num*c.com + com*c.num);
		}
	
		friend ostream& operator<<(ostream &out, const Complex &c) {
			out << c.num << " + " << c.com << "i";
			return out;
		}
		
		friend istream& operator>>(istream &in, Complex &c) {
			in >> c.num >> c.com;
			return in;
		}
};

int main() {
	Complex c1(4, 2);
	Complex c2(7, 4);
	Complex c3 = c1 + c2;
	Complex c4 = c1 * c2;
	cout << "c1 : " << c1 << endl;
	cout << "c2 : " << c2 << endl;
	cout << "Addition Of Two   complex Number (c1 + c2) : " << c3 << endl;
	cout << "Multiplication Of Complex Number (c1 * c2) : " << c4 << endl;
	Complex c5;
	cout << "Enter a complex number in Format (0 + 0i) : ";
	cin >> c5;
	cout << "c5: " << c5 <<endl;
	return 0;
}