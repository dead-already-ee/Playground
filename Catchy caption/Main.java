#include <string>
#include <iostream>
using namespace std;
int main()
{
   string str;
  getline(cin, str);
  int count=0,length;
  length = str.length();
  size_t found = 0;
  while(found != string::npos){
  found = str.find(" ",found + 1);
    count++;
    if(!isalpha(str[found+1])&&isspace(str[found+2])){count--;}
  }
  if(count<=10&&str.capacity()<=100){cout<<"Caption eligible for the contest";}
  else{cout<<"Caption not eligible for the contest";}
}