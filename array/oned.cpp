#include<iostream>
#include<vector>
using namespace std;
vector<int>inverse(vector<int> &arr){
    vector<int>ans(arr.size(),0);
    for(int i=0;i<arr.size();i++){
        int val=arr[i];
        ans[val]=i;
    }
    return ans;

}
bool binarysearch(vector<int>&arr,int data){
    int lo=0;
    int hi=arr.size()-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]==data){
            return true;
        
        }
        else if(arr[mid]<data){
            lo=mid+1;
        }else{
            hi=mid-1;
        }
    }
    return false;
}

vector<int>reverse(vector<int> &arr){
    vector<int>index(arr.size(),0);
    for(int i=0;i<arr.size();i++){
        while(index[i]!=i){
            int vindex=index[i];
            swap(arr[i],arr[vindex]);
            swap(index[i],index[vindex]);

        }
    }
}
// void print(vector<int>&arr,int i,intj){
//     for(int idx =i;idx<=j;idx++){
       
//     }
// }
int main(){
    vector<int>arr{1,2,3,4,5};
    // vector<int>ans=inverse(arr);
    // for(int i=0;i<ans.size();i++){
    //     cout<<ans[i]<<" ";
    // }
    cout << binarysearch(arr,4) << endl;

}