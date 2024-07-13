#include <iostream>
#include <cmath>

using namespace std;

class Quadratic {
	private:
		double a, b, c;
	public:
		
		Quadratic() {
			a = 0;
			b = 0;
			c = 0;
				}
		
		Quadratic(double a, double b, double c) {
			this->a = a;
			this->b = b;
			this->c = c;	
			}
		
		Quadratic operator+(const Quadratic& q) {
			return Quadratic(a + q.a, b + q.b, c + q.c);
				}
	
		friend ostream& operator<<(ostream& os, Quadratic q) {
			os << q.a << "x^2 + " << q.b << "x + " << q.c;
			return os;
				}
		
		friend istream& operator>>(istream& is, Quadratic& q) {
			cout << "Enter the values of a, b, and c: ";
			is >> q.a >> q.b >> q.c;
			return is;	
			}
	
		double eval(double x) {
			return a*x*x + b*x + c;	
			}
		
		void solve() {
			double discriminant = b*b - 4*a*c;
			if (discriminant < 0) {
				cout << "No real solutions" << endl;
			} else if (discriminant == 0) {
				cout << "One real solution: " << -b/(2*a) << endl;
			} else {
				cout << "Two real solutions: " << (-b + sqrt(discriminant))/(2*a) << " and " << (-b - sqrt(discriminant))/(2*a) << endl;
			}	}
};
int main() {
	Quadratic q1 ;
	cout<<"for Equation q1  :-- ";
	cin>>q1;
	Quadratic  q2;
	cout<<"for Equation q2  :--  ";
	cin >> q2 ;
	Quadratic q3 = q1 + q2;
	cout << "q1 +q2 = "<< q3 << endl;
	cout << "Evaluation at x = 2: " << q3.eval(2) << endl;
	cout << "Solutions: ";
	q3.solve();
	return 0;
}