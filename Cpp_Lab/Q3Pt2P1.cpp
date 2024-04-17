#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int> nums = {1,2,3,4};
    for (int nums:nums){
        cout<<nums<<" ";
    }
    cout<<endl;

    vector<int> UserNum;
    for(int i=0; i<5;i++){
        int temp;
        cout<<"Input 5 integers: ";
        cin>>temp;
        UserNum.push_back(temp);
    }
    for(int i=0; i<5;i++){
        cout<<UserNum.back();
        UserNum.pop_back();
    }
    return 0;
}