#include<iostream>
#include<vector>
using namespace std;
class Pair
{
    public:
     int min;
     int max;
};
class Pair MinMax(vector<int>&arr,int first,int last)
{
    Pair minmax,mm1,mm2;
    int mid;
    if(first==last)
    {
        minmax.max=arr[first];
        minmax.min=arr[first];
        return minmax;
    }
    if(last == first+1)
    {
        if(arr[first] > arr[last])
        {
            minmax.max=arr[first];
            minmax.min=arr[last];
        }
        else
        {
            minmax.max=arr[last];
            minmax.min=arr[first];
        }
        return minmax;
    }
    mid= (first+last)/2;
    mm1=MinMax(arr,first,mid);
    mm2=MinMax(arr,mid+1,last);
    if(mm1.min < mm2.min)
      minmax.min == mm1.min;
    else 
      minmax.min=mm2.min;
    if(mm1.max > mm2.max)
      minmax.max=mm1.max;
    else
     minmax.max=mm2.max;
     return minmax;      
}
int main(int args,char **argv)
{
    vector<int>arr;
    int n;
    cout<<"Enter number of array elements:\n";
    cin >> n;
    cout<<"Enter array elements\n";
    for(int i=0;i<n;i++)
    {
        cin >>arr[i];
    }
    class Pair minmax=MinMax(arr,0,n-1);
    cout << "Minimum element is:" << minmax.min<<endl;
    cout << "Maximum element is:"<<minmax.max<<endl;
    return 0;  
}