#include<iostream>
using namespace std;
 int raj(int a,const int b=50){


  /*  b=a+1;
      
        इथे b हे constant आहे
          त्यामुळे आपण
         त्याला बदलू नाही शकत */
        
        
return a*b;

}


int main()

{ 
 int x=2;
 cout<<"the value is "<<raj(x)<<endl;
int y=5;
cout<<"the value is "<<raj(y)<<endl;
int s=3;
 cout<<"the value is "<<raj(s)<<endl;
 int p=4;
 cout<<"the value is "<<raj(p)<<endl;
 int q=1;
 cout<<"the value is "<<raj(q)<<endl; 
 int r=6; 
 cout<<"the value is "<<raj(r)<<endl;
 
    return 0;
}