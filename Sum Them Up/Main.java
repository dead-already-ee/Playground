#include <iostream>
using namespace std;

int main() 
{
  int r,c;
  cin>>r>>c;
  int a_1[r][c];
  int a_2[r][c];
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            cin>>a_1[i][j];
        }
    }
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            cin>>a_2[i][j];
        }
   }
  for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            cout<<a_1[i][j]+a_2[i][j]<<" ";
        }
    cout<<"\n";}
    return 0;
}