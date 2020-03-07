#include<iostream>
#include<vector>
using namespace std;
void input(vector<int>& arr){
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
        // cout<<arr[i]<<" ";
    }
}

void display(vector<int>&arr){
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
}
int maxvector(vector<int> &arr){
     int mymax =arr[0];
        for(int i=0;i<arr.size();i++){
            if(arr[i]>mymax){
                mymax=arr[i];
            }
        
        }
    return mymax;
}
int spain(vector<int> &arr){
     int mymax =arr[0];
     int mymin=arr[0];
        for(int i=0;i<arr.size();i++){
            if(arr[i]>mymax){
                mymax=arr[i];
            }
            if(arr[i]<mymin){
                mymin=arr[i];
            }
        
        }
    return mymax-mymin;
}
int patern(vector<int>&arr){
    //input(arr);
    int mymax=maxvector(arr);
    //cout<<mymax;
    
    for (int i=mymax; i>0; i--){
        for(int j=0;j<arr.size();j++){
            if(arr[j]<i){
                cout<<"  ";
            }
            else{
                cout<<"* ";
            }
        
        }
        cout<<endl;
        mymax--;
    }
    return 0;
}
void swap(vector<int>&arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
void reverseArray(vector<int>&arr){
    int i=0;
    int j=arr.size()-1;
    while(i<j){
        swap(arr,i,j);
        i++;j--;
    }
}


int main(){
    //  int size=0;
    //  cin>>size;
    //  cout<<size<<endl;
    vector<int> arr{3,4,5,6,8,9};
    // input(arr);
     display(arr);
//    int result= maxvector(arr);
//    patern(arr)

reverseArray(arr);
display(arr);
//    int result=spain(arr);
//    cout<<result;
    return 0;
}