#include <iostream>
using namespace std;
int main() {
   int n;
    cout << "Enter the number of elements in the Fibonacci sequence: ";
    cin >> n;
  /*
         fill in here with 
         dynamically allocating the array
         assign the first 2 numbers
         and then iteratively filling up the rest of the array with the rest of the sequence
  */
    int* PreviousFib = new int[n];
    PreviousFib[0]=0;
    PreviousFib[1]=1;
    
    for(int i=2; i<n; i++){
        PreviousFib[i] = PreviousFib[i-1]+PreviousFib[i-2];
    }

    cout << "The Fibonacci sequence is: "<<endl;
   /*
        fill in here by printing the array
        then deallocate the array
   */
    for(int i=0;i<n;i++){
        cout<<PreviousFib[i]<<endl;
    }

    delete[] PreviousFib;
    return 0; 
}