#include<bits/stdc++.h>
using namespace std;
int main()
{
vector<int> a;
long long c=0,b=0,n;
  cin>>n;
  while(n!=0){
    a.push_back(n%10);
    n=n/10;
  }
  for(long long i=a.size()-1; i>=0; i--){
  	if (i%2==0)
      b+=a[i];
    else
      c+=a[i];
  }
  if(c>b)
    cout<<(c-b);
  else
    cout<<(b-c);
}