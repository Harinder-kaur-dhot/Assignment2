//create class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileMarksCalculator 
{
    //Create main method
    public static void main(String [] srg)
    {
        //create exception handling
        try
        {
            File myFile = new File(" prog5001_students_grade_2022.docx");
            Scanner myReader = new Scanner(myFile);     //scanner method to read file
            while (myReader.hasNext())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No file found");
        }
    }
}


