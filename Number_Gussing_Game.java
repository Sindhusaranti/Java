import java.util.*;
public class Number_Gussing_Game {
    public static void main(String[] arg)
    {
       Random rand=new Random();
       Scanner sc=new Scanner(System.in);
       int n=rand.nextInt(100)+1;
       boolean isguessed=false;
       System.out.println("Guess the RANDOM NUMBER ");
       System.out.println( "A number is chosen between 1 and 100.");
       System.out.println( "You have  6 attempts per round to guess the correct number.");

       for(int i=1;i<=6;i++)
       {
         System.out.println("You have "+(6-i+1) + "chances👍 to WIN🎉");
         int n1=sc.nextInt();
        if(n1<n)
            System.out.println("Your Guessing number is LESS than the ACTUAL NO.😶‍🌫️");
        else if(n1>n)
            System.out.println("Your Guessing number is GREATER than the ACTUAL NO.😥");
        else
          {System.out.println("You NAILED it...YOU GUESSED the CORRECT NUMBER");
          System.out.println("CONGRATULATIONS🎉😎🥳");
          isguessed=true;
          break;
          }
        }
        if(!isguessed)
        {
            System.out.println("YOU LOSE this game 😔.... TRY AGAIN with ENTHUSIASM 😃");
            System.out.println("The correct number was: " + n);
        }
        sc.close();
} 
}
