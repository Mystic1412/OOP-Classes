#include <iostream>
using namespace std;
/*Write a program to find and print the first perfect square (i*i) whose last two digits are both odd.
- while loop
-square it
-check each digit
- print out if both digits are odd.
Very important
Make sure to check that the answer you get is indeed a perfect square.*/
int main(){
    int num=1;
    while(true){
        int squared = num *num;
        if(squared >10){
            int FirstDigit = squared %10, SecondDigit = squared%100;
            if(FirstDigit%2 ==1 && SecondDigit%2 == 1){
              cout<<squared<<" is a perfect square whose last two digits are both odd!"<<endl;
              return false;
            }
        }
    }
    cout<<"hello";
    return 0;
}