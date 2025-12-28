import java.util.*;

public class ONED{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter" +n+" elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print(num[i]+" ");
        }
        sc.close();
    }
}
