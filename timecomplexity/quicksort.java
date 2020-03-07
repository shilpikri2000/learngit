class quicksort{
    public static int partition (int[]arr,int lo,int hi){
        int i=lo;
        int j=lo;
        int pivot=arr[hi];
        while(i<=hi){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }else{
                i++;
            }
        }
         return j-1;
         
    }
    public  static void quick(int []arr,int lo,int hi){ //timecomplexity of quicksort is o(nlogn)
        if(lo>=hi){
            return ;
        }
        int pvtidx =partition(arr,lo,hi);
        quick(arr,lo,pvtidx-1);
        quick(arr,pvtidx+1,hi);
    }
    public static void retrnindex( int[]arr,int ){
        int 
    }                       //timecomplexity of this will be o(n) //spacecomplexity of this will be o(1)
                                                        
    public static void main(String[] args){
    int arr[]={3,5,2,4,6,10,4,8};
    quick(arr,0,arr.length-1);
    for(int n=0;n<arr.length;n++){
        System.out.print(arr[n]+" ");
    }
    }
}