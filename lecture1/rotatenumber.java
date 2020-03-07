import java.util.*;
class rotatenumber{
    public static void main(String[] args){
     Scanner scn=new Scanner(System.in);
     int n=32578;
     int r=3;
     int n1=n;
     int length=0;
     while(n!=0){
         n1=n1/10;
         length++;
     }
     r=r%length;
     if(r<0){
         r=r+length;
     }
     int post=0;
     int pow=1;
     int r1=r;
     while(r>0){
         int rem=n%10;
         n=n/10;
         post=rem*pow+post;
         r--;
     }
     length=length-r1;
     while(length>0){
         post=post*10;
         length--;
     }
     post=post+n;
     System.out.print(post);
     return;
    }
}