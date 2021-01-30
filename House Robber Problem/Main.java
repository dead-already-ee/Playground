#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int b[a];
  for(int i=0; i<a; i++)
  cin>>b[i];
  int r=0;
  vector<int> l;
  int m=b[0];
  for(int i=0; i<a; i++){
    m=0;
for(int j=0; j<a; j++){
  if(m<b[j]&&b[j]!=0){
    m=b[j];
    r=j;}
}  l.push_back(m);
    b[r]=0;
    if(r!=0)
    b[r-1]=0;
    if(r!=a)
    b[r+1]=0;
  }
  m=0;
  for(int i=0; i<l.size(); i++)
    m+=l[i];
  cout<<m;
}