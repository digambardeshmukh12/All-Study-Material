#include <iostream>
#include <cmath>
using namespace std;
class simplecal
{
protected:
    double a;
    double b;

public:
    void simdata()
    {
        cout << "enter the firdt number " << endl;
        cin >> a;
        cout << "enter the secound number " << endl;
        cin >> b;
    }

    void simcalsy()
    {
        cout << "the a+b of two value " << a + b << endl;
        cout << "the a-b of two value " << a - b << endl;
        cout << "the a*b of two value " << a * b << endl;
        cout << "the a/b of two value " << a / b << endl;
    }
};

class scical
{

protected:
    double a;

public:
    void scidata()
    {
        cout << "enter value of a " << endl;
        cin >> a;
    }

    void scicalcy()
    {

        cout << "the value of sin(a) is " << sin(a) << endl;
        cout << "the value of cos(a) is " << cos(a) << endl;
        cout << "the value of tan(a) is " << tan(a) << endl;
        cout << "the value of acos(a) is " << acos(a) << endl;
        cout << "the value of asin(a) is " << asin(a) << endl;
        cout << "the value of atan(a) is " << atan(a) << endl;
    }
};

class calculator : public simplecal , public scical {
int a;

};
int main()
{
    calculator x1;

    x1.scidata();
    x1.scicalcy();
    return 0;
}
