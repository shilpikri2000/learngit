class Main{
public static void main(String[]args){
    int n=3124;
    int dno=1;
    int ans=0;
    while(n!=0){
        int ad=n%10;
        n=n/10;
        ans=ans+(int)(Math.pow(10,ad-1));
        dno++;
    }
    System.out.println(ans);
}
}