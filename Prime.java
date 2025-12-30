import java.util.*;
public class Prime {
    public static void main(String[] arg)
    {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter n Value:");
       int n=sc.nextInt();
       for(int i=2;i<=n;i++)
       {   int count=0;
           for(int j=2;j<=i/2;j++)
           {
            if(i%j==0)
            {
                count=count+1;
                break;
            }
           }
           if(count==0)
            {
                System.out.println(i);
            }
        }
             sc.close();
    }
}
