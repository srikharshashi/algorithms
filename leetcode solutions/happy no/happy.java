class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do
        {
          slow=getSum(slow);
          fast=getSum(getSum(fast));
            
            
        }while(slow!=fast);
       
            if(slow==1)
                return true;
        return false;
            
    }
    
    static int getSum(int n)
    {
        int sq=0;
        while(n>0){
            int r=n%10;
            sq+=Math.pow(r,2);
            n=n/10;
        }
        return sq;
    }
}