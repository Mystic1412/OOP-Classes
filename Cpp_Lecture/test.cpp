#include <iostream>
using namespace std;

int main(){
    int i =1;
    while (!((i*i)%2==1 && ((i*i)/10)%2 == 1 )){
        i++;
    }
    int square = i*i;
    cout<<square<<" i = "<<i<<"\nsquare/i should be i but = "<<square/i<<endl;
    return 0;
}