#include<iostream>
using namespace std;
int main(){
    int n;
    int temp=n;
    int power=1;
    cout<<"enter tha value of n";
    cin>>n;
    while(temp>=10){
        temp=temp/10;
        power=power *10;
    }
    temp=n;
    while(power!=0){
        int q=temp/power;
        cout<<q<<"/n";
        temp=temp%power;
        power=power/10;
    }
   
}