#include<iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int count=0;
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            count++;
            break;
        }
    }
    if(count==0){
        cout<<"Prime";
    }else{
        cout<<"Not Prime";
    }
}
