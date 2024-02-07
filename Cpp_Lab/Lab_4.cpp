#include <iostream>
using namespace std;

int main(){
    cout<<"First one"<<endl;
    here: cout<<"Hello! ";

    while(true){
        goto here;
    }
    return 0;
}