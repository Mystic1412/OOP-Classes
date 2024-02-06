#include <iostream>
using namespace std;

int main(){
    int a = 3, b = (9), c = {2005};
    cout<<a<<b<<c<<endl;
    //all three ways intialization
    //auto means it becomes whatever it makes sense for it

    //2d array is a set of pointers that points to an array (confusing, I know)
    int board[8][8] = { //can also use bool 1 = true, 0 = false
        {1,1,1,1,1,1,1,1}, //cout<<board is the address of this array
        {0,0,0,0,0,0,0,0}, //cout<<board+1 is the address of this array
        {0,0,0,0,0,0,0,0}, // cout<<board+2 is the address of this array
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0}
        };

        for(int r=0; r<8; r++){
            for(int x:board[r]){ //this is ranged based for loops
                cout<<x;
            }
            cout<<endl;
        }
        //d refrence

    return 0;
}