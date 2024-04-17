#include <iostream>
using namespace std;
struct Student{
    string name;
    int age;
    char grade;
    };
int main(){
    
    Student s[3]{
        {"Josh",19, 'A'},
        {"Emma", 23, 'C'},
        {"Bob", 5, 'F'}
    };

    for(int i=0;i<3;i++){
        cout<<s[i].name<<" Age: "<<s[i].age<<" Grade: "<<s[i].grade<<endl;
    }
    
    return 0;
}