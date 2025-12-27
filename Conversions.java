import java.util.Scanner;
public class Conversions {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a decimal number:");
        int d1=sc.nextInt();
        String octal=Integer.toOctalString(d1);
        System.out.println("Octal number for given decimal :"+octal);
        String hexa=Integer.toHexString(d1);
        System.out.println("HexaDecimal number for given decimal :"+hexa);
        String binary=Integer.toBinaryString(d1);
        System.out.println("Binary number for given decimal :"+binary);

        System.out.printf("Enter one octal number:");
        String oct=sc.next();
        int d2=Integer.parseInt(oct,8);
        System.out.println("Decimal number for given octal :"+d2);
        
        System.out.printf("Enter one HexaDecial number:");
        String hex=sc.next();
        int d3=Integer.parseInt(hex,16);
        System.out.println("Decimal number for given HexaDecimal :"+d3);
        sc.close();
    }
}
