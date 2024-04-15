#include <iostream>
#include <vector>
using namespace std;
int main( ){
    vector<int>  s({1,2,3,4,5,6});

    for(int i=s.size(); i>=0; --i){
        cout<<s[i]<<endl;
    }


    return 0;
}