#include<iostream>
using namespace std;
int fact(int x){
    int ans=1;
    for(int i=1;i<=x;i++){
        ans=ans*i;
    }
    return ans;
}
void display(int n,int r){
    int nfact=fact(n);
    int nmrfact=fact(n-r);
    cout<<nfact/nmrfact;
}

int main(){
    int n=5;
    int r=2;
    cin>>n;
    cin>>r;
    int nfact = fact(n);
    int nmrfact = fact(n-r);
    display(n,r);
}