#include <iostream>
using namespace std;
#include <cmath>

bool ok(int arr[]){
    //for each column (or queen)
    for (int c=0; c<8; c++){
        //Look at the columns before
        for(int i=0; i<c; i++){
            if(arr[c]==arr[i]|| (c-i)==abs(arr[c]-arr[i])){
                return false;
            }
        }
    }
    return true;
}

int main(){
    int q[8];
    int counter =1;
    for(int i0 = 0; i0<8;i0++){
        
        for(int i1 =0; i1<8;i1++){
            
            for(int i2 =0; i2 <8;i2++){
                
                for(int i3 =0; i3<8;i3++){
                   
                    for(int i4 =0; i4<8;i4++){
                        
                        for(int i5 =0; i5<8;i5++){
                            
                            for(int i6=0; i6<8;i6++){
                                
                                for(int i7=0; i7<8;i7++){
                                    q[0] = i0;
                                    q[1] = i1;
                                    q[2] = i2;
                                    q[3] = i3;
                                    q[4] = i4;
                                    q[5] = i5;
                                    q[6] = i6;
                                    q[7] = i7;
                                    
                                    
                                    if (ok(q)){
                                        cout<<"Solution: "<<counter<<endl;//print results
                                        for(int row=0; row<8;row++){
                                            for (int col=0; col<8; col++){
                                                if(q[col]==row){
                                                    cout<<"1"<<" ";
                                                }
                                                else{
                                                    cout<<"0"<<" ";
                                                }
                                            }
                                            cout<<endl;
                                        }
                                        counter++;
                                        cout<<endl;
                                    }
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