import java.util.Scanner;

public class GuessGame {



 public static void main(String args[])
 {


     Scanner scanner = new Scanner(System.in);
     boolean success=false;

     int random = (int)(Math.random()*100)+1;
     System.out.println("I will pick a number between 1 & 100");
     System.out.println("you have 10 try to guess it ");

     for(int i=0; i<10; i++)
     {
         System.out.println("you have "+(10-i)+" guess");
         int guess=scanner.nextInt();

         if(guess<random)
             System.out.println("The number is greater than "+ guess);
         else
         if(guess>random)
             System.out.println("The number is less than "+ guess);

         else{
             success= true;
             break;
     }

     }

     if(success)
         System.out.println("you succesde the number is "+random);
     else
         System.out.println("you ran out of gusses");
 }

}
