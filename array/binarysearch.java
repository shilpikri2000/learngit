class binarysearch{
    public static binarySearch(int[]arr,int data){
         int lo=0;
    int hi=arr.size()-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]==data){
            high=mid-1;
        
        }
        else if(arr[mid]<data){
            lo=mid+1;
        }else{
            hi=mid-1;
        }
        if((mid-1)>=&&arr[mid-1]==data){
            high=mid-1;
        }else{
            return mid;
        }
//error solve yourself
    }
    
    public static void main(String[]args){
        int []arr={3,3,4,5,6,6,8};
        System.out.println(binarysearch(arr,3));
    }
}

