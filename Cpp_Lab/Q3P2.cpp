#include <iostream>
using namespace std;

int main(){
    struct Rect{
        double length;
        double height;

        
        double area(){
            return length*height;
        }
    };

    Rect Obj1;
    Obj1.length = 2.0;
    Obj1.height = 3.0;

    cout<<Obj1.area()<<endl;
    
struct Rectangle {
      int length;
      int width;
};
Rectangle rect = { 20, 10 };

cout << rect.width;

    return 0;
}