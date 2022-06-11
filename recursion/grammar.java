package recursion;
public class grammar {
    public static void main(String[] args) {
        
       System.out.println( getDig(2, 2));

    }
    //Method 1 :- DO NOT USE TIME LIMIT EXCEEDED
    // static method1()
    // {
    //     int n=20;
    //     int k=1;
    //     if(n==1 && k==1)
    //         return ;
    //     int c=n;
    //     String newstr="";
    //     while (c!=1) {
            
    //         newstr=formstr(newstr);
    //         c--;
    //     }
    //     System.out.println(newstr.charAt(k-1)=='1'?"hehe":"not hehe");

    // }
    // static String formstr(String str)
    // {
    //     if(str=="")
    //         str="0";
    //     String newstr="";
    //     for(int i=0;i<str.length();i++){
    //         if(str.charAt(i)=='0')
    //             newstr+="01";
    //         else
    //             newstr+="10";
    //     }
    //     return newstr;
    // }

    //METHOD 2:- Binary Search 
    static int getDig(int n,int k)
    {
        if(n==1 && k==1){
            return 0;
        }
        int mid=(int)Math.pow(2, n-1)/2;
        if(k<=mid){
            return getDig(n-1, k);
        }
        else if(k>mid){
            return getDig(n-1, k-mid)==1?0:1;
        }




return 0;
    }
}
