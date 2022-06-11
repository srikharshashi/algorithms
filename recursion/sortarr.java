package recursion;


import java.util.*;


public class sortarr {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(7);
        arr.add(6);
        arr.add(4);
        arr.add(5);
        arr.add(9);
        
        sort(arr);

        for (Integer i: arr) {
            System.out.print(" "+i);
        }


    }

    static void sort(ArrayList<Integer> arr)
    {
        //Base Condition
        if(arr.size()==1)
            return;


        //Hypothesis :- it sorts the array 
       


        //Induction
        int temp=arr.remove(arr.size()-1);
        sort(arr);


        insert(arr, temp);     
    }
    static void insert(ArrayList<Integer> arr,int e)
    {
        if(arr.size()==0 || arr.get(arr.size()-1)<=e)
        {
            arr.add(e);
            return;
        }
        int t=arr.remove(arr.size()-1);
        insert(arr, e);
        arr.add(t);
        return;
    }


}
