class oned{
    public static void rearr(int[]value,int[]index){
        for(int i=0;i<value.length;i++){
            while(index[i]!=i){
             int idx=index[i];

             swap(value,i,idx);
             swap(index,i,idx);
            }
        }
    }
  public static void swap(int[]arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }




public static void maxsumsubarray(int[]gen){
    int sum=0;
    int max =0;
    int os=0;
    int oe=0;
    int cs=0;
    int ce=0;
    while(ce<gen.length){
        
    // System.out.println(os+" "+oe+"-----"+cs+" "+ce+"   "+sum);
        
        if(sum>0){
            sum=sum+gen[ce];
        }
        else{
            cs = ce;
            sum = gen[ce];
        }
        if(max<sum){
            max=sum;
            os=cs;
            oe=ce;
        }
        ce++;
    }
    // System.out.println(os+" "+oe);
    for(int i=os;i<=oe;i++){
            System.out.println(gen[i]+" ");
        }

}  
  
   public static void main(String[]args){
       int []arr={5,-3,2,-8,1,4,7,-1,6,-8};
    //    int []index={3,0,4,1,2};
    //    rearr(value,index);
    maxsumsubarray(arr);
    //    display(arr);
    

    }
}
