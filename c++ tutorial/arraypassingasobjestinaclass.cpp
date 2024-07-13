#include<iostream>
using namespace std;
class students {
    int rollno;

public:
    void getdata(void){
     cout<<"enter your roll no"<<endl;
     cin>>rollno;
     }

    void setdata(void) {
        cout<<"your roll no of student is "<<rollno<<endl;
    }


};
int main()
{
 students s[10];
 for(int i=1;i<=10;i++){

 s[i].getdata();
 s[i].setdata();
}

    return 0;
}