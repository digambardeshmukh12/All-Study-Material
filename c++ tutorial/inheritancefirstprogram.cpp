#include <iostream>
using namespace std;
class raj
{
private:
public:
    int a;
    raj(int x)
    {
        a = x;
    }
    void getdata()
    {   
        cout << "enter the value of object "  << endl;
        cin >> a;
        cout<<"the value of object is "<<a<<endl;
    }
    raj() {}
};
class boy : public raj
{
};
int main()
{
    raj x;
    x.getdata();
    boy p;
    p.getdata();
    return 0;
}