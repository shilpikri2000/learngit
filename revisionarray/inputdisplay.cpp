#include<iostream>
#include<vector>
using namespace std;
void input(vector<int>&arr){
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
    }
}
void display(vector<int>&arr){
    for(int i=0;i<arr.size();i++){
        cout<<arr[i];
    }
}
int main(){
    int size=0;
    cin>>size;
    vector<int>arr(size,1);
    input(arr);
    display(arr);
    return 0;
}