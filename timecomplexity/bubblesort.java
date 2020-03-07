import java.util.*;
class bubblesort{
    
    // public static void selectionsort(int arr[]){
    //     int n=arr.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[i];
    //                 arr[i]=arr[j];
    //                 arr[j]=temp;
    //             }
    //         }
    //     }
    // }
    public static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; i++) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
    
    public static void display(int arr[]){
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
           System.out.println(arr[i]+" ");
        }
    }
    public static void sort(int arr[] ){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int result;
        //int arr[]=new arr[];
        int arr[]={3,8,-2,4,6,1,7};
        sort(arr);
         display(arr);

         
    }
}