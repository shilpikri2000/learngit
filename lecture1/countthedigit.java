import java.util.*;
class countthedigit{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int t=n;
       int nod=0;
       while(t!=0){
           t=t/10;
           nod++;
       }
       int div=1;
       for(int i=1;i<=nod-1;i++){
           div=div*10;
       }
       while(div!=0){
           int q=n/div;
           int r=n%div;
           System.out.println(q);
           n=r;
           div=div/10;
       }
    }
}