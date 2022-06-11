class rev {
    public int reverse(int x) {
        if(x==0)
            return x;
        
        boolean pos=true;
        if(x<0)
        {
            x=-x;
            pos=false;
        }
        
        int n=0;
        
        while(x>0)
        {
            int rem=x%10;
            if(n>Integer.MAX_VALUE/10)
                return 0;
            n=n*10+rem;
            x=x/10;
        }
        return pos?n:-n;
    }
}