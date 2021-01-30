#include<iostream>
using namespace std;

int main()
{
  int n,a=1;
  cin>>n;
  int ar[n];
  for(int i=0;i<n;i++){cin>>ar[i];}
  for(int i=0;i<n;i++){a=a*ar[i];}
  for(int i=0;i<n;i++){ar[i]=a/ar[i];}
  for(int i=0;i<n;i++){cout<<ar[i]<<endl;}
  return 0;
}