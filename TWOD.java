import java.util.*;
public class TWOD {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter No.of rows in array:");
      int m=sc.nextInt();
      System.out.print("Enter No.of columns in array:");
      int n=sc.nextInt();
      int nums[][]=new int[m][n];

      for(int i=0;i<m;i++)
      {
        System.out.print("Enter "+ i + "th row elements:");
         for(int j=0;j<n;j++)
         {
            nums[i][j]=sc.nextInt();
         }
      }
      System.out.println("array elements:");
      for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++)
         {
            System.out.print(nums[i][j]+" ");
         }
         System.out.println();
      }
      sc.close();
    }
}
