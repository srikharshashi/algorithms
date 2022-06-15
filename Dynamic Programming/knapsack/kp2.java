
public class kp2 {
    public static void main(String[] args) {
        int n=3;
        int wt[]={1,2,3};
        int val[]={2,3,5};
        int W=4;
        int mat[][]=getMat(n, W);

        System.out.println(knapsack2(wt, val, W, n,mat));
    }
    static int knapsack2(int wt[],int val[],int W,int n,int[][] mat){
        if(W==0 || n==0){
            return 0;
        }
        if(mat[n][W]!=-1)
            return mat[n][W];
        if(wt[n-1]<=W){
            int a=knapsack2(wt, val, W-wt[n-1], n-1,mat);
            int b=  knapsack2(wt, val, W, n-1,mat);
            mat[n][W]= Math.max(a+val[n-1], b);
            return mat[n][W];
        }
        else{
            mat[n][W]=  knapsack2(wt, val, W, n-1,mat);
            return mat[n][W];
        }

    }

    static int[][] getMat(int n,int m){
        int mat[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for (int j = 0; j < mat[0].length; j++) {
                if(i==0 || j==0)
                mat[i][j]=0;
                else
                mat[i][j]=-1;

            }
        }
        return mat;
    }

    static void MatInit2(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for (int j = 0; j < mat[0].length; j++) {
                if(i==0 || j==0)
                mat[i][j]=0;
            }
        }
    }
}
