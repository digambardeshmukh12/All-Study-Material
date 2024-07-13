#include <iostream>
using namespace std;
class volume
{

public:
    int a;
    int b;
    int c;
    float C;

    volume();
    volume(int, int, int);
    volume(int, int, double);
};
volume::volume(int x, int y, int z)
{
    a = x;
    b = y;
    c = z;

    int q = a * b * c;
    cout << "the product of a,b,& c is " << q << endl;
}

volume::volume(int x, int y, double z)
{
    a = x;
    b = y;
    C = z;

    double p = a*b*C;

    cout << "the product of a,b,& C is " << p << endl;
}
int main()
{
    volume raj(32, 42, 42);
    volume sam(6,5,3.74);
    return 0;
}
