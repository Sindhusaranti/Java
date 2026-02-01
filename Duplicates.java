import java.util.Scanner;
public class Duplicates {
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter "+n+" elements:");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      System.out.println("Array after removing duplicates:");
      for(int i=0;i<n;i++)
      {
         boolean isduplicate=false;
         for(int j=0;j<i;j++)
         {
            if(arr[j]==arr[i])
               {
                  isduplicate=true;
                  break;
               }
         }
         if(!isduplicate)
         {
            System.out.printf("%d ",arr[i]);
         }
      }
      sc.close();
   }
}
