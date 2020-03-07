import java.util.*;
class stringt{
    public static String togglecharacter(String str){
        String ans=" ";
        for(int i=0;i< str.length();  i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){
                ch=(char)(ch-'a'+'A');
            }else{
                ch=(char)(ch-'A'+'a');
            }
            ans=ans+ch;
        }
        return ans;
    }
    public static int[] zeronetwo(int[]arr){
        int i=0;
        int j=0;
        int k=0;
        while(k<arr.length){
            if(arr[k]==0){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                k++;
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                i++;
                j++;
            }
            else if(arr[k]==1){
                int temp3=arr[j];
                arr[j]=arr[k];
                arr[k]=temp3;
                j++;
                k++;

            }
            else{
               k++;
               
                
            }
        }
        return arr;
    }
    public static void main(String[] args){
    // System.out.print(togglecharacter("VsTeR"));
    int []arr={0,2,0,2,1,0,2,1,1,0,2};
    int[] ans=zeronetwo(arr);
    for(int n=0;n<ans.length;n++){
        System.out.print(ans[n]+" ");
    }
    }
}