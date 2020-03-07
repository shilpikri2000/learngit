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
    public static boolean isthere(int[] arr,int val){
        boolean exist=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                exist=true;
                break;
            }
        }
        return exist;
    } 
    public staic void additionofTA(int[] a,int[] b){
        int mysize=a.length<b.length?b.length+1:a.length+1;
        int[] ans =new int [mysize];
        int i=a.length-1,j=b.length-1,k=ans.length-1;
        int carry=0;
        while(i>=0&&j>=0){
            int num=a[i]+b[j]+carry;
            carry =num/10;
            num=num%10;
            ans[k]=num;
            i--;j--;k--;
        }
        if(i>=0){
            while(i>=0){
                 int num=a[i]+carry;
            carry =num/10;
            num=num%10;
            ans[k]=num;
            i--;k--;
            }
        }
        if(j>=0){
             int num=b[j]+carry;
            carry =num/10;
            num=num%10;
            ans[k]=num;
            j--;k--;
        }
        if(carry>=0){
            ans[k]=carry;
        }
    }
   
    public static void main(String[] args){
        int size=scn.nextInt();
        int [] arr=new int [size];
        input(arr);
        display(arr);
        int val=scn.nextInt();
        boolean exist=isthere(arr,val);
        System.out.print(exist);
        // findmax(arr);
        additionofTA(arr,a,b);
    }
}