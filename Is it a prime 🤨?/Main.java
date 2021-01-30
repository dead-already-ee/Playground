#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  long long n;
  cin>>n;
  for(long long i=2;i<=sqrt(n);i++){
    if(n%i==0&&i!=n){cout<<"Not Prime";return 0;}
  }
  cout<<"Prime";
  return 0;
}