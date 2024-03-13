#include <iostream>
#include <cmath>
using namespace std;

bool ok(int arr[],int c){
    for(int i=0; i<c; i++){
        if(arr[c]==arr[i] || (c-i)==abs(arr[c]-arr[i])){
           return false;
        }
    }
    return true;
}

int main(){
    int board[8], col=0, counter =1;
    board[col]=0;

NextCol:    //next col
    col++;
    if(col==8) goto print;
    board[col]=-1;
    
NextRow:
    board[col]++;
    if(board[col]==8)goto BackTrack;
  
if(ok(board, col)==false){
    goto NextRow;
}
goto NextCol;

BackTrack:
    col--;
    if(col==-1) return 0;
    goto NextRow;

print: //print
    cout<<"Solution: "<<counter<<endl;//print results
        for(int row=0; row<8;row++){
            for (int col=0; col<8; col++){
                if(board[col]==row){
                    cout<<"1"<<" ";
                }
                else{
                    cout<<"0"<<" ";
                }
            }
            cout<<endl;
        }
        counter++;
        cout<<endl;
    goto BackTrack;
}