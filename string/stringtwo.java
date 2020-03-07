import java.util.ArrayList;
class stringtwo{
    public staic ArrayList<String>stairspath(int n){


      
        ArrayList<String> myans=new ArrayList<>();
         
        if (n-1>=0)
        ArrayList<String> recans1=stairspath(n-1);
        for(String str:recans){
        ans.add(n)
        if(n-2>=0)
        myans+=stairspath(n-2);
        if(n-3>=0)
        myans+=stairspath(n-3);
        return myans; 


    }
    public static int stairspath(int n){
     if(n==0){
         return 1;
     }

        int myans=0;
        if (n-1>=0)
        myans+=stairspath(n-1);
        if(n-2>=0)
        myans+=stairspath(n-2);
        if(n-3>=0)
        myans+=stairspath(n-3);
        return myans;
        
    }
    public static ArrayList<String>subseq(String ques){
        if(ques.length()==0){
            ArrayList<String> basres=new ArrayList<>();
            basres.add("");
            return basres;
        }
        String roq=ques.substring(1);
        ArrayList<String> recans=subseq(roq);
        ArrayList<String> myans=new ArrayList<String>();
        char ch=ques.charAt(0);
        for(String str:recans){
            myans.add(ch+str);
        } 
        for(String str:recans){
            myans.add(str);
        }
        return myans;
    }
    public static void subsequence(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String roq=ques.substring(1);
        subsequence(roq,ans+ch);
        subsequence(roq,ans);

    }
    public static void main(String[]args){
        // String ques="abc";
        // subsequence(ques,"");
        // ArrayList<String> ans=subseq(ques);
        // System.out.println(ans);
        System.out.println(stairspath(7));

    }
}