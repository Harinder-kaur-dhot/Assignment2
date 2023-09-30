//create class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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
            //declare a list to store data, the list is StudentData type
            List<StudentData> studentDetails = new ArrayList<>();
            int i=1;                                   //counter or each line in the file
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                i++;
                if(i<=2 || data.isEmpty())
                {
                    continue;       // to skip first two lines
                }
                //now we need to break the data in to chuncks or split it by ","
                String[] chuncks = data.split(",");
                if(chuncks.length >= 6)
                {
                    String lastName = chuncks[0];
                    String firstName = chuncks[1];
                    String studentId = chuncks[2];
                    String a1 = chuncks[3];
                    String a2 = chuncks[4];
                    String a3 = chuncks[5];
                    
                    //now put all these values in the list, for this we need more functions from StudentData class
                    StudentData s1 = new StudentData(firstName, lastName, studentId, a1, a2, a3);
                    //now add this data into list using add() method
                    studentDetails.add(s1);
                }



            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No file found");
        }
    }
}



