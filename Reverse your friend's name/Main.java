#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  string str,str_r;
  getline(cin,str);
  str_r=str;
  int length=str.length();
  for(int i=0;i<length;i++){
    str_r[i]=str[length-i-1];
  }
  cout<<str_r;
}