#include <iostream>
using namespace std;
class complex
{
    int a;

public:
    complex() {

        a=0;
    }
    complex(int z)
    {

        a = z;
    }

    complex(complex &obj)
    {
     cout<<"copy constructor called"<<endl;
        a = obj.a;
    }

    void printdata(void)
    {

        cout << "the value for this object is " << a << endl;
    }
};
int main()
{

    complex x(43), y(53), z;
    x.printdata();
    y.printdata();
    z.printdata();
    complex z1(z);
    z1.printdata();
    return 0;
}