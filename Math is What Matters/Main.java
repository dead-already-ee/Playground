#include<bits/stdc++.h>
using namespace std;
int main()
{
  vector<int> a;
  long long b=0,m,n;
  cin>>n;
  m=n;
  while(n!=0)
  {
    a.push_back(n%10);
    n=n/10;
  }
  for(long long i=0; i<a.size(); i++){
    b=b+pow(a[i],a.size());
  }
  if(b==m)
    cout<<"Yes";
  else
    cout<<"No";
}