#include<iostream>
#include<string>
using namespace std;
string s[200];
int ir=0;
void del(int n){
  for(int i=n;i<ir;i++){
    if(i!=ir-1){s[i]=s[i+1];}
  }
  ir--;
}
void append(string str){
  s[ir]=str;
  ir++;
}
void clean(){
  for(int i=0;i<ir;i++){
    for(int j=i+1;j<ir;j++){
      if(s[i].compare(s[j])==0){del(j);}
    }
  }
}
void permu(string str,string pstr){ 
  if(str.size()==1){append(pstr+str);}
  char temp;
  string t=str;
  if(str.size()==2){
    append(pstr+str);
    temp=str[0];str[0]=str[1];str[1]=temp;
    append(pstr+str);return;
  }
  for(int i=0;i<str.size();i++){
    temp=str[i];
    t.erase(i,1);
    permu(t,pstr+temp);
    t=str;
  }
}
int main()
{
  string str;
  char temp;
  cin>>str;
  for(int i=0;i<str.size();i++){
    if(isalpha(str[i])){
    for(int j=i+1;j<str.size();j++){
      if(isalpha(str[j])){
    if((int)str[i]>(int)str[j]){
    temp=str[i];str[i]=str[j];str[j]=temp;}}}}}
  permu(str,"");
  clean();
  for(int i=0;i<ir;i++){cout<<s[i]<<endl;}
  return 0;
}