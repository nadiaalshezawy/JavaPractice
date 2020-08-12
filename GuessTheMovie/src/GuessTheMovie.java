import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheMovie {

    public static void main(String args[])throws FileNotFoundException
    {


           File movie = new File("movies.txt"); //for ex foo.txt
           Scanner fileScanner = new Scanner(movie);

         int index=0;
         boolean success=false;

         //storing the movie

        ArrayList<String> movieList = new ArrayList<String>();


        while(fileScanner.hasNextLine())
        {
            movieList.add(index,fileScanner.nextLine());
         //   System.out.println(movieList.get(index));
            index++;

        }


        int indexguess=(int)(Math.random() * ( index)) ;


        String movieguess=movieList.get(indexguess);
        char[] usergusess=new char[movieguess.length()];
        String[] wrongletter=new String[10];
        int correctguess=0,i=0,y=0,repeat=0, correctguesscount=0;

  //    System.out.println( movieguess.length() +"  " +movieList.get(indexguess));


        System.out.print("You are guesseing :");
        for( i=0; i<usergusess.length;i++) {
            usergusess[i] = '-';
            System.out.print(usergusess[i]);
        }
        System.out.println();
        int count=0;
        System.out.println("You are having :"+ count+ " guess");

        Scanner scanner = new Scanner(System.in);
        String guessletter;
        int find=0;

      while(count<10)
      {
       System.out.print("Guess a letter :");
       guessletter=scanner.nextLine();

          for(y=0;y<usergusess.length;y++)
              if(guessletter.charAt(0) ==usergusess[y])
                  repeat=1;

       //  System.out.println("   " +movieguess.indexOf(guessletter.charAt(0)));
       for( i=0; i<usergusess.length;i++)
       {
         if((guessletter.charAt(0)==movieguess.charAt(i)) && repeat==0  )
         {

               usergusess[i]=guessletter.charAt(0);
               correctguess=1;
             correctguesscount++;}



         if( correctguesscount==movieguess.length()) {
             success = true;
             break;
         }

       }

       repeat=0;

         for( i=0; i<usergusess.length;i++)
          System.out.print(usergusess[i]);

       System.out.println();
//
          if(success) {
              count = 10;
              System.out.println("you scesseded");
          }
          if(correctguess==1)
          {
              System.out.println("You have guessed :"+ count+ " wrong numbers");
          }
          else {
              count++;
              System.out.println("You have guessed :"+ count+ " wrong numbers");
          }
          correctguess=0;
         }



    }
}
