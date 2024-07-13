#include<iostream>
using namespace std;
int raj(int a){
if(a<=1){
return 1;
}
return raj(a-2)+raj(a-1);

}
int main()
{
  for(int x=0;x<=15;x++){

cout<<raj(x)<<endl;
}
    
    return 0;
}