#include <iostream>
#include <cstring>
using namespace std;
struct raj
{
  int favnum;
  char favchar;
  float salary;
};
int main()
{
  struct raj kumar;
  kumar.favnum = 6262;
  kumar.favchar = 'D';
  kumar.salary = 720.300;

  cout << kumar.favchar<<endl;
  cout << kumar.favnum<<endl;
  cout << kumar.salary<<endl;

  return 0;
}