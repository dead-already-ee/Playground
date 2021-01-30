#include<bits/stdc++.h>
using namespace std;
int main(){
int a;
string s;
cin>>s;
a=s.length();
  for(int j=0; j<a; j++){
for(int i=a-1; i>0; i--){
  if(s[i]=='1'&&s[i-1]=='1')
    i-=1;
if(s[i]=='1'&&s[i-1]=='0'){
s[i]='0'; s[i-1]='1';}
else continue;
}}
cout<<s;
}