import java.util.Scanner;
import java.lang.Math;
public class Max_Subarray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of max Subarray:");
        int k=sc.nextInt();
        int res=0,sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        res=sum;
        for(int i=k;i<n;i++)
        {
            sum=sum-arr[i-k]+arr[i];
            res=Math.max(sum,res);
        }
        
        System.out.printf("The max sum of subarray is : %d",res);
        sc.close();
    }
}
