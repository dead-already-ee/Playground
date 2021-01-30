#include<iostream>
using namespace std;
int sum(int x){
  int b=0;
  while(x/10!=0){
    b+=x%10; x=x/10;}
  b+=x;
  return b;
}
int main()
{
  int c;
  long long a,b;
    cin>>a>>b;
  for(int i=a; i>0; i--){
  if((i-sum(i))>=b){
    c++;} 
    else continue;
  }
  cout<<c<<endl;
  
}
