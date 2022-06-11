package recursion;

public class subsequences
{
    public static void main(String[] args) {
        sub("abc", "");
    }

    static void sub(String ip,String op)
    {
        if(ip.isEmpty())
        {
            System.out.print(op+" ");
            return;
        }
        char ch=ip.charAt(0);
        ip=ip.substring(1);
        sub(ip, op);
        sub(ip,op+ch);

    }
}