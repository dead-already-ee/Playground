#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, i;    
cin.getline(str, 100);
  for(i=0;str[i]!='\0';i++){
    count++;
  }
  for(i=0;i<=count;i++){
    rev[i]=str[count-i-1];
  }
  rev[count]='\0';
std::cout<<rev;
}