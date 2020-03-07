import java.util.*;
class string1{
    public static void main(String[] args){
        String s="abcdef";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
            String str = s.substring(i,j);
            System.out.println(str+" ");
            }
        }
    }
}