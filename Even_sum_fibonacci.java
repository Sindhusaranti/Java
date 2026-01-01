import java.util.Scanner;
public class Even_sum_fibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a number:");
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        int sum=0;
        while(c<=n)
        {
            if(c%2==0)
            {
                sum=sum+c;
            }
            a=b;
            b=c;
            c=a+b;
        }
        System.out.printf("The sum of even numbers in fibonacci series upto "+ n+" number :"+sum);
        sc.close();
    }
}
