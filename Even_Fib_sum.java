import java.util.*;
class Even_Fib_Sum
{
   public static void main(String arg[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number:");
    int n=sc.nextInt();
    int a=0;
    int b=1;
    int sum=0;
    for(int i=1;i<=n;i++)
    {   if(a%2==0)
        {
            sum=sum+a;
        }   
         int c=a+b;
        a=b;
        b=c;
    }
    System.out.println("The sum of even NO.S upto your given NO.of series:"+ sum);
    sc.close();
   }
}