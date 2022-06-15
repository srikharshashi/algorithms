
public class subsetsum {
    public static void main(String[] args) {
        int arr[]={2,3,7,8,10};
        System.out.println(getSubsetSum(arr, 11));
    }

    static boolean getSubsetSum(int arr[],int sum){
        int n=arr.length;
        //i ---> the array size
        // j ---> the sum of the subset 
        boolean t[][]=new boolean[n+1][sum+1];
        MatInit(t);
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=sum; j++) {
                //the only way you can select the element is if the element is less than sum right??
                // makes sense??
                if(arr[i-1]<=j){
                    boolean a=t[i-1][j-arr[i-1]];
                    boolean b=t[i-1][j];
                    t[i][j]=a|| b;
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    static  void MatInit(boolean[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==0 && j==0){
                    arr[i][j]=true;
                }
                else if(i==0){
                    arr[i][j]=true;
                }
                else if(j==0){
                    arr[i][j]=false;
                }
            }
        }
    }
}
