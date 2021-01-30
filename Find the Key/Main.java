#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int digit(int n,int a){
  for(int i=0;i<a;i++){n=n/10;}
  return n%10;
}
int compare(int x,int y,int z,int a){
  int great;
if(a==0){
  great = x;
  if(great<y){great=y;}
  if(great<z){great=z;}
}
  else{
      great = x;
  if(great>y){great=y;}
  if(great>z){great=z;}
  }
  return great;
}
int main()
{
  int num1,num2,num3,key=0;
  cin>>num1;
  if(num1>=1000&&num1<=9999){
    cin>>num2;
    if(num2>=1000&&num2<=9999){cin>>num3;}
  }
  if(num3>=1000&&num3<=9999){
    for(int i=0,s=0;i<4;i++){
      key+=compare(digit(num1,i),digit(num2,i),digit(num3,i),s)*pow(10,i);
      if(s==0){s=1;}else{s=0;}
    }
  }
  cout<<key;
  return 0;
}