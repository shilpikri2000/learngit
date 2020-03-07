class twodarrayone{
    public static void display(int[][]arr){ 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
                System.out.println("\t");

        }
    }
    public static void spiralprint(int[][]arr){
        int minr=0; int minc=0;
        int maxr=arr.length-1;int maxc=arr[0].length-1;
        int count=0;
        while(count<arr.length*arr[0].length){
            // top wall fixed minr
            for(int i=minc;i<=maxc;i++){
                System.out.print(arr[minr][i]+" ");
                count++;
            }
            minr++;
            // right wall fixed maxc
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
                count++;
            }
            maxc--;
            // bottom wall fixed maxr
            for(int i=maxc;i<=minc;i--){
                System.out.print(arr[maxr][i]+" ");
                count++;
            }
            maxr--;
            // left wall fixed minc
            for(int i=maxr;i<=minr;i--){
                System.out.print(arr[i][maxc]+" ");
                count++;
            
            }
            minc++;
        }
    }
    public static void transpose(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i<j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;

                }
            }
        }
    }
    public static void rotate(int[][]arr){
        transpose(arr);
        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[arr.length-1-i][j];
                arr[arr.length-1-i][j]=temp;
            }
        }
    }
    public static void main(String[]args){
        int[][]arr = {{1,2,3,10,20},{4,5,6,15,25},{7,8,9,30,40},{60,70,80,90,100}};
        display(arr);
        spiralprint(arr);
        // System.out.println("----------------------------------");
        // rotate(arr);
        // display(arr);
    }
}