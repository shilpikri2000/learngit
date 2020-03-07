#include<iostream>
#include<vector>
using namespace std;
void input(vector<int>& arr){
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
        // cout<<arr[i]<<" ";
    }
}

void display(vector<int> &arr){
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
}

int main(){
    int size=0;
    cin>>size;
    // cout<<size<<endl;
    vector<int> arr(size,0);
    input(arr);
    display(arr);
    return 0;
}