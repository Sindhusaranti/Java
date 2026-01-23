
public class Demostr {
    public static void main(String[] args)
    {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.length());
        System.out.println(s1.charAt((1)));
        System.out.println(s1.isEmpty());
        System.out.println(s1.indexOf('H'));
        System.out.println(s1.compareTo(s2));
        s1=s1.concat(("Hi"));
        
    }
}
