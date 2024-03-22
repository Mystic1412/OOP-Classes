#include<iostream>
using namespace std;
// pro for proposals
bool ok(int pro[], int c) { // Finish this code 0 for most liked 2 for least liked c= current man q[c]= current woman
	static int mp[3][3] = { { 0,2,1 },  	// Man#0's preferences 
				            { 0,2,1 },	    // Man#1's preferences
				            { 1,2,0 } };	// Man#2's preferences

	static int wp[3][3] = { { 2,1,0 },		// Woman#0's preferences
				            { 0,1,2 },	    // Woman#1's preferences
				            { 2,0,1 } };	// Woman#2's preferences

	/*Similar to 1D Queens, use a loop to check the array.
	  Inside the loop we chould check for 3 conditions
	  First condition checks is the same women is married to two different man *hint we need to check if two things are equal*
	  Second condition checks if (Man_i) and (Man_c's wife) both like each other more than their own spouse
	  Third condition checks if (Man_c) and (Man_i's wife) both like each other more than their own spouse

	  mp[i][j] tells you how much Man_i likes Woman_j. (0 = favorite; 2 = least favorite)
	  wp[i][j] tells you how much Woman_i likes Man_j.

	  mp[i][pro[i]] tells you how much Man_i likes his own wife.
	  mp[i][pro[c]] tells you how much Man_i likes Man_c's wife.
	  wp[pro[i]][i] tells you how much Man_i's wife likes Man_i.
	  wp[pro[i]][c] tells you how much Man_i's wife likes Man_c.
	  If mp[i][pro[c]] < mp[i][pro[i]], it means that Man_i likes Man_c's wife more than his own wife
	*/

	//if we pass the loop, what do we return?

    for (int i=0;i<c;i++){
        if(pro[i]==pro[c]){
            return false;
        }

        //Second condition checks if (Man_i) and (Man_c's wife) both like each other more than their own spouse
        //man i liking current man's wife more than his own wife 
        //  mp[i][pro[c]] < mp[i][pro[i]], it means that Man_i likes Man_c's wife more than his own wife
        //                                   wp[pro[i]][c] < wp[pro[i]][i], means Man_'c wife likes Man_i more her own husband
        if((mp[i][pro[c]] < mp[i][pro[i]] && wp[pro[i]][c] < wp[pro[i]][i])){
            return false;
        }

        //Third condition checks if (Man_c) and (Man_i's wife) both like each other more than their own spouse
        if(mp[c][pro[i]] < mp[c][pro[c]] && wp[i][c] < wp[i][i]){
            return false;
        }
    }
    
    return true;
}

void print(int q[]) {
	static int solution = 0;
	cout << "Solution #" << ++solution << ":\nMan\tWoman\n";
	//Finish this print function such that you print the index (man) and value (woman) with a tab inbetween
    for(int i=0; i<3;i++){
        cout<<i<<"  "<<q[i]<<endl;
    }
}


int main() {
    int q[3] ={}, c=0; //c= first current
    q[c] =0; //current women

    while(c>=0){
        c++;

        if(c>2){ //checks for everything that's printed
            print(q);
            c--;
        }else{
            q[c]=0;
        }
        while(c>=0&&c<3){
            q[c]++;

            if(q[c]>3){
                c--;
            }else{
                if(ok(q,c)){
                    break;
                }
            }
        }
    }
	//Write the main function.
	//The main function is the same as 8 cross. EXCEPT the array size is different.
	return 0;
}