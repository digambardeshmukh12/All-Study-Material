#include<iostream>
using namespace std;
class college {
    int rollno;
    static int stuno;
public:
    void getid(void) {
        cout<<"enter student roll no "<<endl;
        cin>>rollno;  
        stuno++;
// check the both static member function
    }
    void printid(void){
    cout<<"student roll no is  "<<rollno<<
           " and student no is "<<stuno<<endl;
    }
};
int college::stuno;


int main()
{
   college s1, s2, s3  ;
   s1.getid();
   s1.printid();

   s2.getid();
   s2.printid();

   s3.getid();
   s3.printid();
   
    return 0;
}