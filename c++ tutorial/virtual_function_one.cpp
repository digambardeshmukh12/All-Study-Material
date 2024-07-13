#include <iostream>
using namespace std;

class base
{

public:
    int a = 53;

    virtual void printdata()
    {
        cout << "the value of a is  " << a << endl;
    }
};
class derived : public base
{

public:
    int b = 543;
    void printdata()
    {
        cout << "the value of a is " << a << endl;
        cout << "the value of b is " << b << endl;
    }
};
int main()
{
    base *base_class_pointer;
    base obj_base;
    derived obj_derived;
    // base_class_pointer ->a=43
    base_class_pointer = &obj_derived;

    derived *derived_class_pointer;

    base_class_pointer->printdata();
    derived_class_pointer->printdata();
};
