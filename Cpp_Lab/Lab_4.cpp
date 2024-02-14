#include <iostream>
using namespace std;
bool ok(int board[8][]){

}
int main(){
    int r = 0, c = 0;
    int solutionCountec = 0;
    int b[8][8] = {0};

    for(int c0=0; c0<8; c0++){
        b[0][c0] =1;
        for(int c1=0; c1<8;c1++){
            b[1][c1] =1;
            for(int c2=0; c2<8;c2++){
                b[2][c2] =1;
                for(int c3=0; c3<8;c3++){
                    b[3][c3] =1;
                    for(int c4=0; c4<8;c4++){
                        b[4][c4] =1;
                        for(int c5=0; c5<8;c5++){
                            b[5][c5] =1;
                            for(int c6=0; c6<8;c6++){
                                b[6][c6] =1;
                                for(int c7=0; c7<8;c7++){
                                    b[7][c7] =1;

                                    ok(b); //to check only happens once!

                                    b[7][c7]=0;

                                }

                                b[6][c6] =0 //use to check and this is for erase
                            }
                        }
                    }
                }
            }
        }
    }

    for(int r=0; r<8;r++){
        for(int c =0; c<8; c++){
            cout<<b[r][c];
        }
        cout<<endl;
    }     
    return 0;
}