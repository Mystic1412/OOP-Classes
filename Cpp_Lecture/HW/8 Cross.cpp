#include<iostream>
#include<cmath>
using namespace std;

bool test(int cross[], int curr_box) {
	static int checkList[8][5] = {
		{-1}, //0
		{0,-1}, //1
		{1,-1}, //2
		{0,1,2,-1}, //3
		{1,2,3,-1}, //4
		{2,4,-1}, //5
		{0,3,4,-1}, //6
		{3,4,5,6,-1}, //7
	};
	/*
    fill in
		use the checklist to find the neighbors of curr_box
		so that you can get the indeces of the cross array where you
		check for a consecutive number to the value in cross[curr_box]
  */
 	for(int i =0; i<curr_box;i++){ //so there's no repeat numbers being used
		if(cross[curr_box]== cross[i]){
			return false;
		}
	}
 	for (int i=0; checkList[curr_box][i] != -1;i++){
		if(abs(cross[curr_box] - cross[checkList[curr_box][i]])==1){
			return false;
		}
	}
	return true;
	
}

void print(int cross[]) {
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
	int q[8] = {}, current_box=0;   // Initialize the array to 0.
	q[current_box] = 1;// Start in the 1st value, 1st box
	

	while (current_box >= 0) { // this loop ends when you backtrack from the first box like when c is 1
      	current_box++;// Move to the next box

		if(current_box >7){// If you have passed the last box,
			print(q);
			current_box--; // Call the print function and backtrack
		}
		else{// Otherwise, initialize value to one before the first possible value
			q[current_box]=0;

		}
		while (current_box >= 0 && current_box<8) {
			q[current_box]++;// Move to the next value

			if(q[current_box]>8){// If you have passed the end of the box, backtrack
				current_box--;
				}	
			else{
				if(test(q, current_box)==true){// If the ok function it returns true, break out of this loop to move on from the outer loop
					break;
				}
			}
		}
	}

	return 0;
}