#include <iostream>
using namespace std;
class volume
{

public:
    int x;
    
    volume(int, int);
    volume(int);

    volume(int, int, int);
    volume(double, double, int);

    void printdata()
    {

        cout << "the volume is " << x << endl;
    }
};
volume::volume(int l)
{

    x = l * l * l;
}
volume::volume(int l, int b)
{

    x = l * b;
}

volume::volume(int l, int b, int h)
{

    x = l * b * h;
}
volume::volume(double r, double p, int h)
{

    x = p * r * r * h;
}
int main()
{

    volume a(64, 73), b(54), c(43, 53, 73), d(5.3, 3.4, 53);

    a.printdata();
    b.printdata();

    c.printdata();
    d.printdata();
}