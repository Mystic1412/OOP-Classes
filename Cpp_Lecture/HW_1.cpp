#include <iostream>
using namespace std;
/*Write a program to find and print the first perfect square (i*i) whose last two digits are both odd.
- while loop
-square it
-check each digit
- print out if both digits are odd.
Very important
Make sure to check that the answer you get is indeed a perfect square.
Answer is 13*13 = 169
*/
int main(){
    int i=1;
    bool Run= true;
    while(Run){
<<<<<<< HEAD
        int squared = num *num;
        if(squared >=10){
            int FirstDigit = squared %10, SecondDigit = (squared/10)%10;
            
=======
        int squared = i *i;
        //if(squared >=10){
            int FirstDigit = squared %10, SecondDigit = squared/10%10;
>>>>>>> a141c5e372c7e6d462a7c0409867338691d4773c
            if(FirstDigit%2 ==1 && SecondDigit %2 == 1){
                cout<<i <<" x "<< i<<" = "<<squared<<" is a perfect square whose last two digits are both odd!"<<endl;
                Run = false;
            }
        //}
        i++;
    }
    return 0;
}