#include <iostream>
using namespace std;
int main()
{
    int rollnumber;
    cout << "enter the rollnumber:" << endl;
    cin >> rollnumber;

    switch (rollnumber)
    {
    case 1:
        cout << "you are raj";
        break;
    case 2:
        cout << "you are aarti";
        break;
    case 3:
        cout << "you are swati";
        break;
    default:
        cout << "you are not students of this class ";
    }
    return 0;
}