#include <iostream>
using namespace std;

int a = 0;
class complex
{

public:
    complex()
    {

        a++;

        cout << "constructor is colled " << a << endl;
    }
    ~complex()
    {

        cout << "destructor is colled " << a << endl;

        a--;
    }
};

int main()
{

    cout << "the main is start" << endl;
    cout << "the first object is " << endl;

    complex n1;
    {

        cout << "the block is start" << endl;
        complex n2, n3;
        cout << "the blocks is end" << endl;
    }

    cout << "the blocks is end" << endl;
    cout << "again entering the main" << endl;
    return 0;
}