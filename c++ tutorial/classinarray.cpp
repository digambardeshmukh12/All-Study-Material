#include<iostream>
using namespace std;
class student {
private :
    int rollno[100];
    int stuid[100];
    int count;
public:
    void counter(void) {
        count=0;
    }
    void askroll(void);

    void loop(void);
};
void student::askroll(void) {
    cout<<"enter your roll no "<<count+1<<endl;
    cin>>rollno[count];
    cout<<"enter your id"<<endl;
    cin>>stuid[count];
    count++;
}
void student::loop(void) {

    for(int i=0; i<count; i++) {
        cout<<"your roll number is :"<<rollno[i]<<" and your student id is "<<stuid[i]<<endl;

    }
}
int main()
{
    student s1;
    s1.counter();
    
    s1.askroll();
    s1.askroll();
    s1.askroll();
    
    
    
    s1.loop();

    return 0;
}