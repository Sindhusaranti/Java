import java.util.Scanner;
public class Next_prime {
    public static int Prime(int res)
    {
        int count=0;
        for(int i=2;i<res;i++)
        {
            if(res%i==0)
            {
                count=1;
                break;
            }
        }
        if(count==0)
            return res;
        else
            return Prime(res+1);
    }
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.printf("Enter any prime number: ");
    int n=sc.nextInt();
    int result=Prime(n+1);
    System.out.println("The next PRIME NUMBER of your given number is:"+result);
    sc.close();
   } 
}
