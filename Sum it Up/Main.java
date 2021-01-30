#include<bits/stdc++.h>
using namespace std;
int main()
{
  long long n,b=0;
  cin>>n;
  vector<int> a;
  label:
  while(n!=0){
      a.push_back(n%10);
      n=n/10;
  }
  for(int i=0;i<a.size();i++){b+=a[i];}
  if(b/10!=0){n=b;b=0;a.clear();goto label;}
  else{
  cout<<b;}
}