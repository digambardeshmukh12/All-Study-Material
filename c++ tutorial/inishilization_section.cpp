#include <iostream>
using namespace std;
class raj
{
    int a;

public:
    raj(int x) : a(x)

    // a(x) is a inishilization section 
    {
    }
    void print()
    {

        cout << "the value of a is " << a << endl;
    }
};

int main()
{

    raj x(23);
    x.print();
    return 0;
}