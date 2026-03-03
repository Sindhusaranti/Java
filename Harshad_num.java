//An integer number in base 10 which is divisible by the sum of its digits is said to be a Harshad Number.
// An n-Harshad number is an integer number divisible by the sum of its digit in base n.
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20.........
import java.util.*;
public class Harshad_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int sum=0;
        int t=n;
        while(t!=0)
        {
            sum=sum+t%10;
            t=t/10;
        }
        if(n%sum==0)
        {
            System.out.println("Harshad Number...");
        }else
        {
            System.out.println("Not a Harshad Number....");
        }
        sc.close();
}
}
