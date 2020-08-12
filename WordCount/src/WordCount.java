import java.io.File;

import java.util.Scanner;

public class WordCount {

    public static void main (String args[]) throws Exception
    {
        File file = new File("Robert.txt");

        Scanner fileScanner = new Scanner(file);
        int wordcount=0;

        while(fileScanner.hasNextLine())
        {
            String Line=fileScanner.nextLine();
            wordcount+=(Line.split(" ")).length;

        }

        System.out.println("The number of word in the  book is :" +wordcount);
    }
}
