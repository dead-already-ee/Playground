#include <bits/stdc++.h>
using namespace std;
void swap(int *a, int *b){
int t;
  if(*a>*b){
    t=*a;
  *a=*b; *b=t;}
  else return;
}
int main() 
{
   int n;
   cin>>n;
  int a[n];
  for(int i=0; i<n; i++)
    cin>>a[i];
  cout<<"Before Sort:"<<endl;
    for(int i=0; i<n; i++){
      cout<<a[i]<<" ";
    }
  for(int i=0; i<n;i++){
  for(int j=0; j<n; j++){
    if(j<n-1)
    swap(&a[j],&a[j+1]);
  }
  }
  cout<<endl<<"After Sort:"<<endl;
  for(int i=0; i<n; i++)
    cout<<a[i]<<" ";
}