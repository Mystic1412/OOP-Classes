#include <iostream>
using namespace std;

bad_array_new_length test(int cross[], int curr_box) {
	static int checkList[8][5] = {
		{-1},
		{0,-1},
		{1,-1},
		{0,1,2,-1},
		{1,2,3,-1},
		{2,4,-1},
		{0,3,4,-1},
		{3,4,5,6,-1},
	};

/*
  fill in
		use the checklist to find the neighbors of curr_box
		so that you can get the indeces of the cross array where you
		check for a consecutive number to the value in cross[curr_box]
  */
}

void print(int cross[], int cap) {
  // everytime this function is called, count will not reset to 0 since it is static
  // static means the variable is allocated only once during the runtime of the program
	static int count = 0;
	cout << " Solution number: " << ++count << endl;
	cout << " " << cross[1] << cross[2] << endl;
	cout << cross[0] << cross[3] << cross[4] << cross[5] << endl;
	cout << " " << cross[6] << cross[7] << endl;
	return;
}

int main() {
   int q[8] = {};   // Initialize the array to 0.
   // Start in the 1st value, 1st box

   while (c >= 0) { // this loop ends when you backtrack from the first box like when c is 1
      // Move to the next box

      // If you have passed the last box,
         // Call the print function and backtrack

      // Otherwise, initialize value to one before the first possible value

      while (c >= 0) {
         // Move to the next value

         // If you have passed the end of the box, backtrack

         // If the ok function it returns true, break out of this loop to move on from the outer loop
      }
   }
   return 0;
}