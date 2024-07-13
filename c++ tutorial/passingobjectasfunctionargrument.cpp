#include <iostream>
using namespace std;
class employe
{
    int a;
    int b;

public:
    void getdata(int c1, int c2)
    {
        a = c1;
        b = c2;
    }
    void vectersum(employe e1, employe e2)
    {
        a = e1.a + e2.a;
        b = e1.b + e2.b;
    }
    void printdata(void)
    {
        cout << "the employe is " << a << "+" << b << "i" << endl;
    }
};
int main()
{
    employe x1, x2, x3;
    x1.getdata(2, 2);
    x1.printdata();

    x2.getdata(3, 4);
    x2.printdata();

    x3.vectersum(x1, x2);
    x3.printdata();

    return 0;
}