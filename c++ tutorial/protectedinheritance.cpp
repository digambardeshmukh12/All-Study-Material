#include <iostream>
using namespace std;
class base
{
    int x;

protected:
    int y;

public:
    int z;
    void getdata();
    int setdatax();
    int setdatay();
    int setdataz();
};
void base::getdata()
{

    x = 1;
    y = 2;
    z = 3;
}
int base ::setdatax()
{
    return x;
}
int base ::setdatay()
{
    return y;
}
int base ::setdataz()
{
    return z;
}
class derived : protected base
//class derived : public base
{
    int q;

public:
    void process();
    void printdata();
};
void derived ::process()
{
    q = z * setdatax() * setdatay();
}
void derived ::printdata()
{
    cout << "the value of x is " << setdatax() << endl;
    // cout << "the value of y is " << setdatay() << endl;
    // line no 52 and 54 both are currect 
    cout << "the value of y is " << y << endl;
    cout << "the value of z is " << z << endl;
    cout << "the value of q is " << q << endl;
    cout << "program is currect but 61 and 62 lines are discribed why"
         << " program not give a correct outputr " << endl;
}

int main()
{
    derived raj;
    // raj.getdata();-->its generate error because getdata is -
    //  -protectedly inherited  (in line no -36 )

    raj.process();
    raj.printdata();
    return 0;
}
