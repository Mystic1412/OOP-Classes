#include <iostream>
#include <cmath>
using namespace std;

bool ok(int arr[], int c){
    for(int i=0; i<c; i++){
        //arr[c]==arr[i] to check if the position of the current queens is being used aka the row test
        //(c-i) is the 
        //abs(arr[c]-arr[i]) is to check both the diagonals
        if(arr[c]==arr[i] || (c-i)==abs(arr[c]-arr[i])){
            return false;
        }  
    }
    return true;
}

void print(int arr[]){
    static int counter =0;
    cout<<"Solution: "<<++counter<<endl;//print results
        for(int row=0; row<8;row++){
            for (int col=0; col<8; col++){
                if(arr[col]==row){
                    cout<<"1"<<" ";
                }
                else{
                    cout<<"0"<<" ";
                }
            }
            cout<<endl;
        }
        cout<<endl;
}

int main(){
    int q[8]={}, c=0;
    q[c]=0;

    while(c >= 0){
        if(c==7){
            print(q);
            c--;
        }else{
            q[++c] = -1;
        }while(c>=0){
            q[c]++; //next row

            if(q[c]==8){
                c--;
            }else{
                if(ok(q,c)){
                    break;
                }
            }
        }

    }

    return 0;
}