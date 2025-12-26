import java.util.Scanner;
public class Selection_Sort {
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
        for(int i=0;i<n-1;i++)
        {   int min=i;
            for(int j=i+1;j<n;j++)
            {
               if(arr[j]<arr[min])
               {
                min=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Elements after sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        sc.close();
    }
}
