#include<iostream>
using namespace std;

int main()
{
 int s,d;
  cin>>s;
  int a[s];
  for(int i=0; i<s; i++)
  cin>>a[i];
  d=(a[s-1]-a[0])/(s-1);
  for(int i=0; i<s-1; i++){
  if((a[i+1]-a[i])==d)
    continue;
    else{
    cout<<a[i]+d;
      break;
    }
  }
}