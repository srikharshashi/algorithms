// package recursion;

public class binarry {
    public static void main(String[] args) {
        printNum("1", 5,1, 0);
    }

    static void printNum(String str,int n,int o,int z){
        if(n==0){
            System.out.println(str);return;
        }

        if(o>z){
            printNum(str+"1", n-1, o+1, z);
            printNum(str+"0", n-1, o, z+1);
        }
        else{
            printNum(str+"0", n-1, o, z+1);
        }



    }
}
