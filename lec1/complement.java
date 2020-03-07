class complement{
    public static int getValue(int n, int b1, int b2){
       int d1 = getValueIndecimal(n, b1);
       int d2 = getValueInBase(d1, b2);
       return d2;
   }
  
   public static int getValueIndecimal(int n, int b){
      int rv = 0;
  
     int p = 1;
     while(n > 0){
         int d = n % 10;
         n = n / 10;
         rv += p * d;
         p = p * b;
     }
  
      return rv;
  }
  
   public static int getValueInBase(int n, int b){
      int rv = 0;
  
     int p = 1;
     while(n > 0){
         int d = n % b;
         n = n / b;
         rv += p * d;
         p = p * 10;
     }
  
      return rv;
  }
  }
}