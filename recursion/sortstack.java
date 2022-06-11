package recursion;

import java.util.Stack;


public class sortstack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(0);
        stack.push(10);

        System.out.println("before reverse");
        for (int i : stack) {
            System.out.println(" "+i);
        }

        reverse(stack);

        System.out.println("after reverse");

        for (int i : stack) {
            System.out.println(" "+i);
        }

    }

    //1)Sort a Stack
    static void sort(Stack<Integer> stack)
    {
        if(stack.size()==1)
            return ;

        int temp=stack.pop();
        sort(stack);

        insert(stack, temp);
    }
    static void insert(Stack<Integer> stack,int e)
    {
        //Base Condition
        if(stack.size()==0 || stack.peek()<=e)      
        {
            stack.push(e);
            return;
        }
        int temp=stack.pop();
        insert(stack, e);
        stack.push(temp);
        return;
    }

    //2) Delete middle element of the stack
    static void delmiddle(Stack<Integer> stack,int size)
    {
        if(stack.size()==(size/2)+1)
        {
            stack.pop();
            return;
        }
        int t=stack.pop();
        delmiddle(stack, size);
        stack.push(t);
    }

    //3)Reverse a Stack

    static void reverse(Stack<Integer> stack)
    {
        if(stack.size()==1)
            return;
        
        int t=stack.pop();
        reverse(stack);
        insStack(stack, t);

        return;
    }

    static void insStack(Stack<Integer> stack,int e)
    {
        if(stack.size()==0)
        {
            stack.push(e);
            return;
        }

        int t=stack.pop();
        insStack(stack, e);
        stack.push(t);
        
        return;
    }
}
