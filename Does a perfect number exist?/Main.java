#include<bits/stdc++.h>
using namespace std;
char yes(){
  cout<<"Yes";
}
char no(){
  cout<<"No";
}
int main()
{
  vector<int> a;
  long long n,c=0;
  cin>>n;
  if(n<0){
    no();
  return 0;}
  for(long long i=n/2; i>=1; i--){
    if(n%i==0)
      a.push_back(i);
 	else
      continue;
  }
  for(long long i=0; i<a.size(); i++)
    c=c+a[i];
  if(c==n)
     yes();
  else
     no();
}