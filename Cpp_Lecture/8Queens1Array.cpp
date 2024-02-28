#include <iostream>
#include <cmath>
using namespace std;

bool ok(int arr[]){
    for (int col=0; col<8;col++){
        for(int i=0; i<8; i++){
            if(arr[i]==arr[col]){ //row check
                return false;
            }if(arr[i]==abs(arr[col]-arr[col])){ //both diagonals 
                return false;
            }
        }
    }
    return true;
}

int main(){
    int board[8], int index=0;
    board[index]=1;
NextCol:    //next col
    index++;

if(ok(board)){
    goto NextCol;
}

BackTrack:

goto NextCol;
    //print
    return 0;
}