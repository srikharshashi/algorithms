package recursion;

import java.util.ArrayList;

//Generate Balanced Paranthesis for a given integer n

public class balpar {
    static ArrayList<String> arr=new ArrayList<>();

    public static void main(String[] args) {
        getStr( "(", 2, 3);
        for (String string : args) {
            System.out.println(string);
        }
    }


    static void getStr(String str,int op,int cl){
        if(op==0 && cl==0)
            {
                arr.add(str);
                return;
            }
        else if(op==0){
            getStr( str+")", op, --cl);return;
        }
        else if(cl==0){
            getStr(str+"(", --op, cl);return;
        }
        else if(op<cl){
            getStr( str+")", op, --cl);
            getStr( str+"(", --op, cl);
        }
       
    }
    
}
