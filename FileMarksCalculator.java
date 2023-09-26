//create class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileMarksCalculator 
{
    //Create main method
    public static void main(String [] arg)
    {
        //create exception handling
        try
        {
            File myFile = new File("prog5001_students_grade_2022.rtf");
            Scanner myReader = new Scanner(myFile);     //scanner method to read file
            System.out.println("file found");
            System.out.println();
            System.out.println(myReader);
            int i=1;
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(i+ " " +data);
                i++;
            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No file found");
        }
    }
}



