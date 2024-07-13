#include <iostream>
using namespace std;

class school
{
protected:
    int totaltecher;

public:
    int setdatas();
    void getdatas();
};

int school ::setdatas()
{
    totaltecher = 14;
    return totaltecher;
}
void school ::getdatas()
{
    cout << "the total teachar in school are " << totaltecher << endl;
}

class classes : public school
{
public:
    int tottalclasses;
    int setdatac();
    void getdatac();
};

int classes ::setdatac()
{
    tottalclasses = 12;
    return tottalclasses;
}

void classes ::getdatac()
{
    cout << "the total classes in school are " << tottalclasses << endl;
}

class student  : public classes
{
protected:
    int totalstudent ;

public:
    void getdatah();
    void setdatah();
};

void student  ::getdatah()
{

    totalstudent  = tottalclasses * 50 ;
}

void student  ::setdatah()
{

    cout <<"the total  srudents in  the school " << totalstudent  << endl;
}

int main()
{

    student x;
    x.setdatas();
    x.getdatas();

    x.setdatac();
    x.getdatac();

    x.getdatah();
    x.setdatah();

    return 0;
}