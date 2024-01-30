#include <iostream>
using namespace std;

//finish question #6 on the practice problem
int main(){
    int num;
    cout<<"Enter a number: "<<endl;
    cin>>num;

    int factorial = 1;
    for(int i=1; i<=num;i++){
        //another for loop
        
        factorial = i* factorial;
        cout<<i<<"! = ";
        for (int j=1; j<=i;j++){
            cout<<j;
            if(j!=i) cout<<" x ";
        }
        cout<<" = "<<factorial<<endl;
        
       
    }
    return 0;
}