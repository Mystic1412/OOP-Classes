#include <iostream>
using namespace std;
#include <cmath>

bool ok(int arr[]){
    //for each column (or queen)
    for (int c=0; c<8; c++){
        //Look at the columns before
        for(int i=0; i<c; i++){
            if(arr[c]==arr[i]){
                return false;
            }
            if((c-i)==abs(arr[c]-arr[i])){
                return false;
            }
        }
    }
    return true;
}

int main(){
    int q[8]={};
    for(int i0 = 0; i0<10;i0++){
        
        for(int i1 =0; i1<10;i1++){
            
            for(int i2 =0; i2 <10;i2++){
                
                for(int i3 =0; i3<10;i3++){
                   
                    for(int i4 =0; i4<10;i4++){
                        
                        for(int i5 =0; i5<10;i5++){
                            
                            for(int i6=0; i6<10;i6++){
                                
                                for(int i7=0; i7<10;i7++){
                                
                                }
                            }
                        }
                    }
                }   
            }   
        }     
    }

    return 0;
}