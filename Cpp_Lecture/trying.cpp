#include <iostream>
#include <vector>
using namespace std;

int main( ){
    vector<int>  s[6];

    for(int i=6; i>0; --i){
        s[i%6].push_back(i);
        cout<<s[i%6].back();
    }
    

    return 0;
}

