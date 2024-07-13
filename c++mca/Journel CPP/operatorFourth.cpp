#include <iostream>
using namespace std;
int main() {
    double num1, num2, result;
    char op, choice;
	do {
        cout << "Enter first number, operator, second number: ";
        cin >> num1 >> op >> num2;
		switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    cout << "Cannot divide by zero." << endl;
                    continue;
                }
                result = num1 / num2;
                break;
            default:
                cout << "Invalid operator." << endl;
                continue;
        }
		cout << "Answer = " << result << endl;
        cout << "Do another (y/n)? ";
        cin >> choice;
    } while (choice == 'y');
	return 0;
}
