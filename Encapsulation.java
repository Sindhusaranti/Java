class Student
{
    private int rollno;
    private String name;
    private int marks;

    public int getrollno()
    {
      return rollno;
    }
    public String getname()
    {
        return name;
    }
    public int getmarks()
    {
        return marks;
    }
    public void setroll(int rn)
    {
        rollno=rn;
    }
    public void setname(String n)
    {
        name=n;
    }
    public void setmarks(int m)
    {
       marks=m;
    }
}
public class Encapsulation {
    public static void main(String args[])
    {
        Student obj=new Student();
        obj.setroll(395);
        obj.setname("Pranii");
        obj.setmarks(96);
        System.out.println("Roll No: "+ obj.getrollno()+" Name: "+obj.getname()+" Marks:"+obj.getmarks());
    }
}
