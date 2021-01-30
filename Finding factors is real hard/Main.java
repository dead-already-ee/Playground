#include<iostream>
#include<vector>
#include<math.h>

using namespace std;
int main()
{
  vector<long long> a;
  long long n;
  cin>>n;
  if(n<1||n>10000000000)
    return 0;
  for(long long i=1; i<=sqrt(n); i++){
    if(n%i==0)
      a.push_back(i);
    else
      continue;
  }
  for(long long i=a.size()-1;i>=0;i--){
    if(a[i]==sqrt(n)){continue;}
    a.push_back(n/a[i]);
  }
  for(long long i=0;i<a.size();i++){
    cout<<a[i]<<" ";}
}