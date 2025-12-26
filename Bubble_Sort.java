import java.util.Scanner;
public class Bubble_Sort {
   public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+ n + " elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements before sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Elements after sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        sc.close();
   } 
}
