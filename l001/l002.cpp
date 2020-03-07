#include<iostream>
using namespace std;
int main(){

int a,b,c;
cout<<"enter three number with space";
cin>>a>>b>>c;
int maxnum=-1;
if(a>=b&&a>=c){
    maxnum=a;
}
else if(b>=a&&b>=c){
    maxnum=b;
}
else{
    maxnum=c;
}
cout<<"maxno"<<maxnum<<endl;
return 0;
}