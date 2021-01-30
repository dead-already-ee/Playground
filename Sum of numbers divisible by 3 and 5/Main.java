#include<iostream>
using namespace std;
int SumNumbersDivisible(int m,int n){
  int x,y;
  if(n%15==0){y=n/15-1;}
  else{y=n/15;}
  if(m%15==0){x=m/15-1;}
  else{x=m/15;}
  if(x==y){return 15*(x+1);}
  return 15*((y*(y+1)/2)-(x*(x+1)/2));
}
int main()
{
  int m,n;
  cin>>m;
  cin>>n;
  if(m>=0&&m<=n){
  cout<<SumNumbersDivisible(m,n);}
  return 0;
}