import java.util.*;
class one{
    public static int maze(int sr,int sc,int er,int ec){
        int [][] dp=new int [er+1][ec+1];
        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp[0].length-1;j>=0;j--){
                if(i==dp.length-1 && j==dp[0].length-1){
                    dp[i][j]=1;
                }else if(i==dp.length-1){
                    dp[i][j]=dp[i][j+1];
                }else if(j==dp[0].length-1){
                    dp[i][j]=dp[i+1][j];
                }
                else{
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
    public static int stairpath(int n){
        int [] dp=new int [n+1];
        if(dp[n]>)
        
    }
    public static void main(String[] args){
//for Dp we have to think 3 things 1)storage kaisi hogi,2)meaning (store kya karna cha rhe)3)solve kaise karenge.
        System.out.println(maze(0,0,3,4));
    }
}