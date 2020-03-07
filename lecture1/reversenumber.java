class reversenumber{
    public static void main(String[] args){
        int n=65784383;
        int digit=0;
        while(n!=0){
             digit=n%10;
            n=n/10;
            System.out.println(digit); 
        }
       
    }
}