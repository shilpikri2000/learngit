#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter the value of the n";
    cin>>n;
    int a=0;int b=1;
    for(int i=0;i<=n;i++){
       
        int c=a+b;
        a=b;
        b=c;
    }
     cout<<a<<" ";
}