class A{
     A()
     {
        super();
        System.out.println("Default constructor of A");
     }
     A(int n)
     {
        super();
        System.out.println("Parametrized constructor of A");
     }
}
class B extends A{
    B()
    {
        this(5);
        System.out.println("Default constructor in B");
    }
    B(int n)
    {
        super();
        System.out.println("Parameterized constructor in B"+n);
    }
    void display()
    {
        System.out.println("Display method");
    }
}
public class Super {
    public static void main(String args[])
    {
       B obj=new B();
       obj.display();
    }
}
