#include<iostream>
#include <bits/stdc++.h>
using namespace std;
bool isPrime(int n) 
{  
    if (n <= 1) 
        return false;  
    for (int i = 2; i <= sqrt(n); i++) 
        if (n % i == 0) 
            return false;
    return true; 
} 
int main()
{
  int a,b,gcd_1=-1,gcd_2=-1;
  cin>>a;
  cin>>b;
  for(int i=1;i<=sqrt(a*b);i++){
    if(isPrime(i)){
      if((a*b)%i==0){
        if(a%i==0&&b%i==0){gcd_1=i;}
        if(isPrime(a*b/i)){
        if(a%(a*b/i)==0&&b%(a*b/i)==0){gcd_2=a*b/i;}}
      }
    }
  }
  if(gcd_1>gcd_2){cout<<gcd_1;}
  else{cout<<gcd_2;}
  return 0;
}