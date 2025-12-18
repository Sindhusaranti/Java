import java.util.*;
class Student
{
   public int roll_no;
   public String name;

   Student(int rno,String name)
   {
    this.roll_no=rno;
    this.name=name;
   }
} 
public class Object_arr {
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no.of students:");
    int n=sc.nextInt();
    Student[] arr=new Student[n];
    for(int i=0;i<n;i++)
    {   
        System.out.print("Enter Rool no and name of the "+(i+1)+" student:");
        int rollno=sc.nextInt();
        //sc.nextLine();
        String name=sc.nextLine();
       arr[i]=new Student(rollno,name);
    }
    System.out.println("Student Details");
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i].roll_no+" "+arr[i].name);
    }
    sc.close();
    }
}
