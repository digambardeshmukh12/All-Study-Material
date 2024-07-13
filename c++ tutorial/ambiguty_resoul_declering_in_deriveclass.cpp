#include <iostream>
using namespace std;

class eng
{
public:
    void show()
    {
        cout << "raj is  the devil " << endl;
    }
};
class hindi
{

public:
    void show()
    {
        cout << "raj hi shaitan hai " << endl;
    }
};

class marath
{

public:
    void show()
    {
        cout << "raj ha ek rakshas aahe " << endl;
    }
};

class raj : public eng, public hindi, public marath
{
    int x;

public:
    void show()
    {
        hindi ::show();
    }
};

int main()
{
    raj deshmukh;
    deshmukh.show();

    return 0;
}
