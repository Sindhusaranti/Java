import java.util.*;
public class PIN {
    public static void main(String arg[])
    {
        //Random rand=new Random();
       // int n=rand.nextInt(9999)+1000;
        System.out.println("Enter your Actual PIN");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the Correct PIN to withdraw money");
        boolean bool=false;
        for(int i=6;i>=1;i--)
        {
          System.out.println("You have "+ i+" chances to attempt.");
          int num=sc.nextInt();
          if(n==num)
          {
            System.out.println("Your PIN is matched....✅");
            System.out.println("Withdraw your MONEY Now");
            bool=true;
            break;
          }else{
             System.out.println("Your PIN is mismatched❎....Try Again");
          }
        }
        if(!bool)
        {
             System.out.println("Your attempts are completed...");
             System.out.println("The Actual PIN CODE is "+n);
            
        }
        sc.close();
    }
}
