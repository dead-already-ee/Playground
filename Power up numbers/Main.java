#include<iostream>
using namespace std;
int main()
{
  long long x,a,b;
  cin>>a>>b;
  x=a;
  for(int i=1; i<b; i++)
    a=a*x;
  cout<<a;
}