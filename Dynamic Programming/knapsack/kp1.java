
public class kp1 {
    public static void main(String[] args) {
        // int wt[]={1,2,3,5};
        // int val[]={1,6,10,16};
        // int W=5;
        // int n=4;

        int n=3;
        int wt[]={1,2,3};
        int val[]={2,3,5};
        int W=4;
        System.out.println(knapsack1(wt, val, W, n));
    }
    static int knapsack1(int wt[],int val[],int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){
            int a=knapsack1(wt, val, W-wt[n-1], n-1);
            int b=  knapsack1(wt, val, W, n-1);
            return Math.max(a+val[n-1], b);
            
        }
        else{
            return knapsack1(wt, val, W, n-1);
        }

    }
}
