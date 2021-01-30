#include<iostream>
using namespace std;

void Bsearch(int *ar,int *a,int low,int high){
  int mid = (low+high)/2;
  if(ar[low]==*a){cout<<low;return;}
  else if(ar[mid]==*a){cout<<mid;return;}
  else if(ar[high]==*a){cout<<high;return;}
  else if(mid==low){cout<<"Not found";return;}
  else if(ar[mid]<*a){Bsearch(ar,a,mid,high);}
  else if(ar[mid]>*a){Bsearch(ar,a,low,mid);}
  
}

int main()
{
  int n,a;
  cin>>n;
  int ar[n];
  for(int i=0;i<n;i++){cin>>ar[i];}
  cin>>a;
  Bsearch(ar,&a,0,n-1);
  return 0;
}