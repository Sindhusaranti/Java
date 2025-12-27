import java.util.Scanner;
public class Armstrong {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        int num=n;
        int rem=0;
        double sum=0;
        while(num!=0)
        {
           rem=num%10;
           sum=sum+ Math.pow(rem, 3);
           num=num/10;
        }
        if(sum==n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
         sc.close();
    }
}
