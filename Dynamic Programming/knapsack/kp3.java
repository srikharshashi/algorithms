
public class kp3 {
    public static void main(String[] args) {
        int n=3;
        int wt[]={1,2,3};
        int val[]={2,3,5};
        int W=4;
        int mat[][]=new int[n+1][W+1];
        InitMat3(mat);
        System.out.println(knapsack3(wt, val, W, n, mat));
    }


    static int knapsack3(int[] wt,int val[],int W,int n,int[][] mat ){
        //Iterative Approack to Dynamic Programming is this bottom up tabulation 
        // hwere you get to solve the smaller problem first to build up to the bigger problem
        //also called as tabulation method
        
        //N-- Rows -- i 
        //W-- Colums -- j


        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= W; j++) {
                // System.out.println(i+" "+j);
                if(wt[i-1]<=j){
                    int a=val[i-1]+mat[i-1][j-wt[i-1]];  
                    int b=mat[i-1][j];
                    mat[i][j]=Math.max(a, b);
                }
                else{
                    mat[i][j]=mat[i-1][j];
                }
            }
        }

        return mat[n][W];     
    }

    static void InitMat3(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for (int j = 0; j < mat[0].length; j++) {
                if(i==0 || j==0)
                mat[i][j]=0;
            }
        }
    }
}
