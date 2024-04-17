#include <iostream>
using namespace std;

int main(){
    //Problem 1
    struct Book{
        string title;
        string author;
        int pages;
    };
    Book Book1;
    Book1.title = "the apothecary diaries";
    Book1.author = "Natsu Hyuuga";
    Book1.pages = 256;

    cout<<Book1.title<<endl;
    cout<<Book1.author<<endl;
    cout<<"# of pgs: "<<Book1.pages<<endl;
    return 0;
}