//create class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMarksCalculator {
    // Create main method
    public static void main(String[] arg) {
        // declare a list to store data, the list is StudentData type
        List<StudentData> studentDetails = new ArrayList<>();
        // create exception handling
        try {
            File myFile = new File("prog5001_students_grade_2022.txt");
            Scanner myReader = new Scanner(myFile); // scanner method to read file
            System.out.println("file found");
            int i = 0, choice; // counter or each line in the file and choice for menu
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                i++;
                if (i > 2) {
                    if (data.isEmpty() || data.startsWith("\\"))
                        continue;
                    // now we need to break the data in to chuncks or split it by ","
                    String[] chuncks = data.split(",");
                    if (chuncks.length == 6) {
                        String lastName = chuncks[0].trim();
                        String firstName = chuncks[1].trim();
                        String studentId = chuncks[2].trim();
                        String a1 = chuncks[3].trim();
                        String a2 = chuncks[4].trim();
                        String a3 = chuncks[5].trim();
                        // StudentData class
                        StudentData student = new StudentData(lastName, firstName, studentId, a1, a2, a3);
                        // now add this data into list using add() method
                        studentDetails.add(student);
                    }
                }
            }
            myReader.close();

            // create menu

            do {
                System.out.println("Welcome");
                System.out.println("Press 1 to print student deatils.");
                System.out.println("Press 2 to get total marks.");
                System.out.println("Press 3 to get top 5 student's details with marks.");
                System.out.println("Press 4 to get the  Lowest scorer's details");
                System.out.println("Press 5 to exit");
                System.out.println("Please enter the valid option input");
                Scanner getChoice = new Scanner(System.in);
                choice = getChoice.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("Full Name   Student ID  A1  A2  A3  Total Marks");
                        break;
                    }

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:
                        System.out.print("Thank you");
                        System.exit(0);
                        getChoice.close();

                    default:
                        break;
                }
            } while (choice != 5);
        }

        catch (

        FileNotFoundException e) {
            System.out.println("No file found");
        }
    }
}
