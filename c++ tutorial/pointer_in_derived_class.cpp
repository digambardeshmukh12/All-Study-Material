#include <iostream>
using namespace std;
class base
{
public:
    int a;

    void printdata()
    {

        cout << "the value of a is " << a << endl;
    }
};

class derived : public base
{

public:
    int b;
    void printdata()
    {
        cout << "the value of a is " << a << endl;
        cout << "the value of b is " << b << endl;
    }
};
int main()
{
    /*
    base *base_pointer;
    base obj_base ;
    derived obj_derived ;
    base_pointer -> &obj_derived ;
    base_pointer->a=54;
    base_pointer->printdata();

    cout << "time to run derived class " << endl;

    derived *derived_pointer;
    derived_pointer->b=65;
    derived_pointer->show();
*/
    base *base_class_pointer;
    base obj_base;
    derived obj_derived;
    base_class_pointer = &obj_derived;
    base_class_pointer->a = 34;
    base_class_pointer->printdata();

    base_class_pointer ->a=646;
    base_class_pointer->printdata();

    derived *derived_class_pointer;
    derived_class_pointer = &obj_derived;
    derived_class_pointer->a=6;
    derived_class_pointer->b = 64;
    derived_class_pointer->printdata();
    return 0;
}