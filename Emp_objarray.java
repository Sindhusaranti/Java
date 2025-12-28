import java.util.Scanner;
public class Emp_objarray {

    static class Employee
    {
        public int empid;
        public String name;
        public double salary;

        Employee(int empid,String name, double salary)
        {
            this.empid=empid;
            this.name=name;
            this.salary=salary;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of employees:");
        int n=sc.nextInt();
        Employee emp[]=new Employee[n];
        System.out.println("Enter the empid , empname and emp_salary of "+ n+" employees");
        for(int i=0;i<n;i++)
        {
            int empid=sc.nextInt();
            String name=sc.next();
            double salary=sc.nextDouble();
            emp[i]=new Employee(empid, name, salary);
        }
        System.out.println("Details of employees:");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d %s %.2f%n",emp[i].empid,emp[i].name,emp[i].salary);
        }
        sc.close();
    }
}
