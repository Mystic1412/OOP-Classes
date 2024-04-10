#include <iostream>
using namespace std;


typedef double (*func)(double);

double Equation(double x){
    double xr = x*x+4;
    return xr;
}

double integral(double a, double b){
    func f = Equation;
    double sum=0, x=a, d=(b-a)/4; 
    while(x<b){
        sum += f(x)*d;
        x= x+d;
    }
    return sum;
}


int main(){
    
    cout<<integral(1.0,5.0)<<endl;

    return 0;
}