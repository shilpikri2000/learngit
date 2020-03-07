import java.util.*;
class sorting{
    public static int[] merge(int []arr1,int[]arr2){
        int arr3[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;k++;
            }
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
                i++;k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
                j++;k++;
        }
        return arr3;

    }
    public satic void mergesort(int arr1[],int arr2[]){
        if(lo==hi){
            int[] base=new int[i];
            base[0]=arr[lo];
            return base;
        }
       int mid=[lo+hi]/2;
       int []left=merge(arr,lo,mid);
       int []right=merge(arr,mid+1;hi);
       int sorted=merge(left+right);
       return sorted;
    }
    
    }
    public static void main(String[] args){
     int arr1[]={3,5,8,9,15,18};
     int arr2[]={1,2,10,11,17,19};
    //  int arr3[]=new arr[arr1.length+arr2.length];
     int result[]=merge(arr1,arr2);
     System.out.println(result);
    }
}