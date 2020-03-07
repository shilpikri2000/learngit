 import java.util.*;
class span{
    static Scanner scn=new Scanner(System.in);
    public static void input(int[]arr){
        for(int i=0;i<arr.length;i++){
          arr[i]=scn.nextInt();
        }
    }
    public staic int display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int spain(int[]arr){
        int mymax=arr[0];
        int mymin=arr[0];
        for(int i=0;i<arr.length;i++){
            if(mymax<arr[i]){
                mymax=arr[i];
            }
            else if(mymin>arr[i]){
                mymin=arr[i];
            }
        }
        return mymax-mymin;
    }
    public static void main(String[] args){
     int size=scn.nextInt();
     int [] arr=new int[size];
     input(arr);
     display(arr);
     int result=spain(arr);
     System.out.println(result);

    }
}