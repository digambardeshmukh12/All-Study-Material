#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

int main() {
    string name1, name2, name3;
    int code1, code2, code3;
    double cost1, cost2, cost3;

    // Read in the item details
    cout << "Enter the name of the first item: ";
    getline(cin, name1);
    cout << "Enter the item code: ";
    cin >> code1;
    cout << "Enter the cost: ";
    cin >> cost1;

    cout << "Enter the name of the second item: ";
    cin.ignore(); // ignore the newline character left in the input stream
    getline(cin, name2);
    cout << "Enter the item code: ";
    cin >> code2;
    cout << "Enter the cost: ";
    cin >> cost2;

    cout << "Enter the name of the third item: ";
    cin.ignore();
    getline(cin, name3);
    cout << "Enter the item code: ";
    cin >> code3;
    cout << "Enter the cost: ";
    cin >> cost3;

    // Output the table
    cout << left << setw(25) << "Item Name" << setw(15) << "Item Code" << setw(10) << "Cost" << endl;
    cout << left << setw(25) << name1 << setw(15) << code1 << setw(10) << fixed << setprecision(2) << cost1 << endl;
    cout << left << setw(25) << name2 << setw(15) << code2 << setw(10) << fixed << setprecision(2) << cost2 << endl;
    cout << left << setw(25) << name3 << setw(15) << code3 << setw(10) << fixed << setprecision(2) << cost3 << endl;

    return 0;
}
