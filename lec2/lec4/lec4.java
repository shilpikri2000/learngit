import java.util.*;
class lec4{
    static Scanner scn=new Scanner(System.in);
    public static void input (int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int findmax(int[] arr){
        int mymax =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mymax){
                mymax=arr[i];
            }
        }
    }
    public static void main(String[] args){
        int size=scn.nextInt();
        int [] arr=new int [size];
        input(arr);
        display(arr);
        findmax(arr);
    }
}