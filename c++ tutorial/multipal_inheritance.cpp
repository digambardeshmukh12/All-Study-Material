#include <iostream>
using namespace std;
class papa
{
protected:
    int papamoney;

public:
    void getdatap(int a)
    {

        papamoney = a;
    }
};
class mom
{

protected:
    int mommoney;

public:
    void getdatam(int a)
    {
        mommoney = a;
    }
};

class me : public papa, public mom
{
public:
    int mymoney;
    void memoney()
    {
        mymoney = papamoney + mommoney;
    }
    void show()
    {
        cout << "mere papa ke pas   " << papamoney << "  rupaye hai " << endl;
        cout << "mere mama ke pas   " << mommoney << "  rupaye hai " << endl;
        cout << "mere  pas   " << mymoney << "  rupaye hai " << endl;
    }
};

int main()
{
    me raj;
    raj.getdatap(20000000);
    raj.getdatam(10000000);
    raj.memoney();
    raj.show();
}