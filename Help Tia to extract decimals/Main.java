#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum;
	getline(cin,fnum);
  int length = fnum.length();
  size_t found = fnum.find(".");
  if(found != string::npos){
  cout<<"Floating part is : "<<fnum.substr(found+1,length-found);
  }else{cout<<"Floating part is :";}
}