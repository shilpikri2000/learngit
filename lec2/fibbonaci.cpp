#include<iostream>
using namespace std;
int main(){
    int a=0;int b=1;
    int n; 
    cout<<"enter a value";
    cin>>n;
    for(int i=0;i<n;i++){
        cout<<a;
        int c=a+b;
        
        a=b;
        b=c;
    }
}