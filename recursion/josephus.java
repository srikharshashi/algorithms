public class josephus {
    public static void main(String[] args) {
        

        int arr[]=new int[41];
        int c=0;
        for(int i=1;i<40;i++){
            c=c+7;
            if(c>40){
                c=c-40;
            }
            System.out.print(c+" ");
            
            arr[c]=1;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
                System.out.println(i);
        }
    }
}
