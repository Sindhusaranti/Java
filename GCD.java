import java.util.Scanner;
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter any 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b%a==0)
            System.out.printf("The GCD of 2 numbers is :"+a);
        else{
            int res=0;
            while(b%a!=0)
            {
               res=b%a;
               b=a;
               a=res;
            }
            System.out.printf("The GCD of 2 numbers is: "+res);
        }
        sc.close();
    }
}
