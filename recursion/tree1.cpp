#include<iostream>
using namespace std;
void repeat(int n){
    if(n<=0){
        return;
    }
    cout<<"1";
    repeat(n-1);
    cout<<"2";
    repeat(n-1);
    cout<<"3";
    repeat(n-1);
    cout<<"4";
}
int main(){
int n;
cout<<"enter the value of n";
cin>>n;
repeat(n);
}