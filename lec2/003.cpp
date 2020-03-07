#include<iostream>
using namespace std;
int decimaltooctal(int num){
    int ans=0;
    int pow=1;
    while(num!=0){
        int rem=num%8;
        num=num/8;
        ans=ans+rem*pow;
        pow=pow*10;
    }
    return ans;
}
int octaltodecimal(int num){
    int ans=0;
    int pow=1;
    while(num!=0){
        int rem=num%10;
        num=num/10;
        ans=ans+rem*pow;
        pow=pow*8;
    }
    return ans;
}
int anybasetoanybase(int num,int destination,int base){
    int ans=0;
    int pow=1;
    while(num!=0){
        int rem=num%destination;
        num=num/destination;
        ans=ans+rem*pow;
        pow=pow*base;
    }
    return ans;
}
int octaladdition(int n1,int n2){
    int ans=0;
    int pow=1;
    int carry=0;
    int sb=8;
    while(n1>0||n2>0||carry>0){
        int nom=n1%10;
        int ntm=n2%10;
        n1=n1/10;
        n2=n2/10;
        int digit=nom+ntm+carry;
        carry=digit/sb;
        digit=digit%sb;
        ans=ans+digit*pow;
        pow=pow*10;
    }
    return ans;
}
int octalsubtract(int n1,int n2){
    int ans=0;

bool isswap=false;
if(n1<n2){
    int temp=n1;
    n1=n2;
    n2=temp;
    isswap=true;
}
    int pow=1;
    int borrow=0;
    int sb=8;
    while(n1>0){
        int nom=n1%10;
        int ntm=n2%10;
        n1=n1/10;
        n2=n2/10;
        int digit=nom-ntm-borrow;
        if(digit<0){
            digit=digit+sb;
            borrow=1;
        }else{
            borrow= 0;
        }
        ans=ans+digit*pow;
        pow=pow*10;
    }
    if(isswap==true){
        ans=-ans;
    }
    return ans; 
}
int main(){
    // int a=634;
    // int result=decimaltooctal(a);
    // cout<<result;
    int x=456;
    int y=173;
    int result=octalsubtract(x,y);
    cout<<result;
}