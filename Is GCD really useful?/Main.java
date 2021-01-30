#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  long long a,b;
  cin>>a>>b;
  int gcd_1=1,gcd_2=1;
  for(long long i=1;i<=sqrt(a*b);i++){
    if((a*b)%i==0){
      if(a%i==0&&b%i==0){gcd_1=i;}
      long long l=a*b/i;
      if(a%l==0&&b%l==0){gcd_2=l;}
    }
  }
  if(gcd_1>=gcd_2){cout<<gcd_1;}
  else{cout<<gcd_2;}
}