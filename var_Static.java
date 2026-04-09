class Mobile
{
   String brand;
   int price;
   static String name;
   public void display()
   {
    System.out.println("Brand: "+brand+" Price: "+price+" Name: "+name);
   }
   public static void show(Mobile obj)
   {
    System.out.println("Brand: "+obj.brand+" Price: "+obj.price+" Name: "+name);
   }
}
public class var_Static {
    public static void main(String args[])
    {
        Mobile obj1=new Mobile();
       obj1.brand="Apple";
       obj1.price=1500;

       Mobile obj2=new Mobile();
       obj2.brand="Samsung";
       obj2.price=1700;
       Mobile.name="Smart Phone";

       obj1.display();
       obj2.display();

       Mobile.show(obj1);
    }
}
