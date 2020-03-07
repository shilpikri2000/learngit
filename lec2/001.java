class lec3{
    public static int decimalToBinary(int num){
        int ans =0;
        int pow =1;
        while(num!=0){
              int rem=num%2;
              num=num/2;
              ans=ans+rem*pow;
              pow=pow*10;
        }
        return ans;
    }
    public static int binaryTodecimal(int num){
        int ans=0;
        int pow=1;
        while(num!=0){
            int rem=num%10;
            num=num/10;
            ans=ans+rem*pow;
            pow=pow*2;
        }
        return ans;
    }


    public static void main(String[] args){
        int bin = 1100101;
        int result= binaryTodecimal(bin);
        // System.out.println(result);

        System.out.println(result);
    }
}