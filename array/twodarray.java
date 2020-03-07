import java.util.*;
class twodarray{
    public static Scanner scn=new Scanner(System.in);
    public static void fill(int[][]arr1){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
    }
public static  void display(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
public static void waveprint{
    for(int col=0;col<arr[0].length;col++){
        if(col%2==0){
        for(int row=0;row<arr.length;row++){
         System.out.println([col][row]);
        }
        else{
            for(row=arr.length-1;row>=0;row--){
                System.out.println([row][col]);
            }
        }
    }
}
public static void multiplication(int[][]arr1,int[][]arr2){
    int [][]ans = new int[arr1.length][arr2[0].length];
    
    for(int i=0; i<arr1.length;i++){
        for(int j=0;j<arr1[0].length;j++){
           for(int k=0;k<arr1[0].length;k++){
               ans[i][j]+=arr1[i][k]*arr2[k][j];

           }
        }
    }
    display(ans);
}
    public static void main (String[] args){
        int i=scn.nextInt();
        int j=scn.nextInt();
        int [][] arr1=new int[i][j];
        int[][]arr2=new int[i][j];
        fill(arr1);
        fill(arr2);
        multiplication(arr1,arr2);
        // display(arr);
    }
}