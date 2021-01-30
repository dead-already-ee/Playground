#include<bits/stdc++.h>
using namespace std;
int main(){
int n,m,c=0,d=0;
  vector<int> a,b;
  cin>>n;
  for(int i=0; i<=n; i++){
  a.push_back(i); b.push_back(i);
  }
  while(m<n){
    m=4*(2*a[c]+b[d]);
    c++;d++;
  }
  cout<<(c-1)*8;
}