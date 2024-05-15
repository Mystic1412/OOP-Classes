#include <iostream>
using namespace std;

int fib(int input, int* lookup){
    if(lookup[input] == -1 )
        lookup[input] = fib(input-1, lookup) + fib(input-2, lookup);
    return lookup[input]; 
}

int main(){
    int n;
    cout << "which fibonacci number do you want to calculate?\n";
    cin >> n;
  
    /* dynamically allocate int array with size n+1. 
        This is because the array indeces will be 0 to 4 if you try to find fibonacci 5. 
         You need to also have an index 5 so the size needs to be one more so that its 0 to 5 instead 

         fill in array with -1

         then assign the first two elements with the 0th and 1st fibonacci numbers
    */

    int* PreviouFib = new int[n+1];
    PreviouFib[0]=0;
    PreviouFib[1]=1;

    for(int i=2; i<=n; i++){
        PreviouFib[i] = -1;
    }

    cout << fib(n , PreviouFib) << endl;
    
    // deallocate the array
    delete [] PreviouFib;
    return 0;
}
