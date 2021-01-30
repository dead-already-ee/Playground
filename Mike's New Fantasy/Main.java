#include<iostream>
using namespace std;
int main()
{
  long long a[70];
  int n;
  a[0]=0;
  a[1]=1;
  for(int i=2; i<70; i++)
  {
    a[i]=a[i-1]+a[i-2];
  }
  cin>>n;
  if(n>70||n<1)
    return 0;
  cout<<a[n-1];
}