#include <iostream>
using namespace std;
class raj
{
    int a;

public:
    //   void setdata(int a ){   //this is for the %% marked syntax
    raj &setdata(int a)
    { //this is for the $$ marked syntax

        this->a = a;
        return *this;
    }
    void getdata()
    {
        cout << "the value of a is " << a << endl;
    }
};

int main()
{
    raj sam;
    // sam.setdata(23);  //this is for the %% marked syntax
    // sam.getdata();   //this is for the %% marked syntax
    sam.setdata(23).getdata(); //this is for the $$ marked syntax

    return 0;
}