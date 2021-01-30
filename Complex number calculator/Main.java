#include<iostream>
using namespace std;
struct complex{
  int real=0, img=0;}one, two;
complex add()
{
 complex b;
  b.real= one.real + two.real;
  b.img= one.img + two.img;
  return b;
}
complex pro()
{
 complex b;
  b.real= one.real*two.real-one.img*two.img;
  b.img= one.img*two.real+one.real*two.img;
  return b;
}
complex sub()
{
 complex b;
  b.real= one.real - two.real;
  b.img= one.img - two.img;
  return b;
}
char invalid_choice()
{
  cout<<"Invalid choice";
}
int main()
{
  int a;
  complex b;
  cin>>a;
  cin>>one.real>>one.img>>two.real>>two.img;
  if(a>3)
    return invalid_choice();
  if(a==1)
  	b=add();
  else if(a==2)
    b=sub();
  else if(a==3)
    b=pro();
  if(b.img>0)
   cout<<b.real<<"+"<<b.img<<"i";
  else
     cout<<b.real<<b.img<<"i";
  return 0;
}
 
