import java.util.Scanner;
public class Primefact {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter any number:");
        int n=sc.nextInt();
        System.out.println("The prime factors of "+n+" is:");
        while(n%2==0)
        {
            System.out.printf("%d ",2);
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            while(n%i==0)
            {
                System.out.printf("%d ",i);
                n=n/i;
            }
        }
        if(n>2)
        {
            System.out.printf("%d",n);
        }
        sc.close();
    }
}
