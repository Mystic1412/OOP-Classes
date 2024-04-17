#include <iostream>
using namespace std;


typedef double (*func)(double);

double Equation(double x){
    double xr = (2*x)-5;
    return xr;
}

double integral(double a, double b){
    func f = Equation;
    double sum=0, x=a, d=2; 
    while(x<b){
        sum += f(x)*d;
        x= x+d;
    }
    return sum;
}


int main(){
    
    cout<<integral(-6.0,4.0)<<endl;

    return 0;
}