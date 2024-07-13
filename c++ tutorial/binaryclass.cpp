#include<iostream>
#include<string>
using namespace std;
class binary {
private:
    string s;
public:
    void readdata(void);
    void check(void);
    void display(void);
};
void binary::readdata(void) {

    cout<<"enter a binary number"<<endl;
    cin>>s;

}
void binary:: check(void)
{
    for(int a=0; a<s.length(); a++) {

        if(s.at(a)!='0' && s.at(a)!='1')
        {
            cout<<"it's a wrong binary number"<<endl;
          exit(0);
        }
        
    }

}
void binary :: display(void) {

    cout<<s<<"  it's your binary number"<<endl;
}

int main()
{
    binary  raj;
    raj.readdata();
    raj.check();
    raj.display();
    return 0;
}