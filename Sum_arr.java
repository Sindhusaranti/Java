import java.util.*;
public class Sum_arr {
    public static void Add(int[] arr,int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
       System.out.println("Sum of elements in array is :"+sum);
    }
    public static void main(String arg[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the size of array:");
         int n=sc.nextInt();
         int[] arr=new int[n];
         System.out.print("Enter "+n+" elements:");
         for(int i=0;i<n;i++)
         {
           arr[i]=sc.nextInt();
         }
         Add(arr,n);
         sc.close();
    }
}
