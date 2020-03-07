#include<iostream>
#include<vector>
using namespace std;
void recursion(int x){
    if(x==0){
        return ;
    }
    cout<<x;
    recursion(x-1);
}
void increasing(int x){
    if(x==0){
        return;//n=5
    } //output 1 2 3 4 5 
    increasing(x-1);
    cout<<x<<" ";
}
void repeat(int x){
    if(x==1){  //base case
         cout<<x<<" ";  
         //output 5 4 3 2 1 2 3 4 5
        return;
    }
    cout<<x<<" ";//pre
    repeat(x-1);
    
    cout<<x<<" ";//post
}
// int factorial(int x){
//     int ans;
//     if(x==0){
//     return;
//     }
//     ans=factorial(x)*factorial(x-1);
    
//     return ans;
// }
void printzzz(int n){
    if(n==0){
        return;
    }
    cout<<n<<" ";
    printzzz(n-1);
    cout<<n<<" ";
    printzzz(n-1);
    cout<<n<<" ";
}
void oddeven(int x){
    if(x==0){
        return;
    }
    if(x%2==1){
       cout<<x;
    }
     oddeven(x-1);
    if(x%2==0){
        cout<<x;
    }
}
void printpre (vector<int>&arr,int i)
{
    if(i==arr.size()){
        return;
    }
    cout<<ar[i]<<endl;
    printpre(arr,i+1);
}
int foc(vector<int>&arr,int data,int idx){
    {
        if(idx==arr.size()){
            return -1;
        }
    }
    int recans=foc(arr,data,idx+1);
    if(arr[idx]==data){
        recans=idx;
    }
    return 0;
}
int lopre(vector<int>&arr,int idx,int data,int loc)
{
    if(idx==arr.size()){
        return loc;
    }
    if(loc==data)
    {
        loc=idx;
    }
    int recans=lopre(arr,idx+1,data,loc);
    return recans;
}
      if(arr.size()==0){
          ArrayList<String
          return basres;
      }
void subseq(String ques,String ans){
    if(ques.size()==0){
        cout<<ans<<endl;
        return 0;
        char ch=ques[0];
       
        String roq=ques.substr[1];
        subseq(roq,ans+ch);
        subseq(roq,ans);
    }
}
int floorfill(vector<int>&arr )



int main(){
   // int n;int fact;
    //cout<<"enter the value of n";
    //cin>>n;
    // recursion(n);
    // increasing(n);
    // repeat(n);
    // fact=factorial(n);
    // cout<<fact;
    // printzzz(n);
//oddeven(n);
vector<int>arr{10,20,30,40};
recursion(arr,0);
subseq("abc"," ");
} 
