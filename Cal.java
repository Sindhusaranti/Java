import java.util.*;

class Calculator
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
public class Cal {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter num1 value:");
       int num1=sc.nextInt();
       System.out.println("Enter num2 value:");
       int num2=sc.nextInt();

       Calculator c =new Calculator();
       int res=c.add(num1,num2);
       System.out.println(res);
       sc.close();
    }
}
