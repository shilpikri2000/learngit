#include<iostream>
using namespace std;
int decimalToAnybase(int num,int base){
    int ans=0;
    int power=1;
    
    while(num!=0){
        int rem=num%base;
        num=num/base;
         ans=ans+rem*power;
        power=power*10;
    }
    return ans;
}
int main(){
    int x;
    int y;
    cout<<"enter the number";
    cin>>x;
    cout<<"enter the base";
    cin>>y;
    int result=decimalToAnybase(x,y);
    cout<<result;
    
}