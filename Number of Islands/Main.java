#include<iostream>
using namespace std;
int m,n;
void move(int *ar,int *br,int a,int b){
  if(a>=m||b>=n||a<0||b<0){return;}else{
  if(*((ar+a*n) + b)==0||*((br+a*n) + b)==1){*((br+a*n) + b)=1;return;}
  if(*((ar+a*n) + b)==1){*((br+a*n) + b)=1;move(ar,br,a+1,b);
                  move(ar,br,a-1,b);
                  move(ar,br,a,b+1);
                  move(ar,br,a,b-1);
                  move(ar,br,a+1,b+1);
                  move(ar,br,a-1,b-1);
                  move(ar,br,a+1,b-1);
                  move(ar,br,a-1,b+1);
                 }}
}
int noIslands(int *ar){
  int br[m][n];
  int count=0;
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){br[i][j]=0;}}
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
    if(br[i][j]==0&&*((ar+i*n) + j)==1){
      count++;
      move(ar,&br[0][0],i,j);
    }
  }}
  return count;
}
int main()
{
  cin>>m>>n;
  int ar[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){cin>>ar[i][j];}}
  cout<<noIslands(&ar[0][0])-1;
  return 0;
}