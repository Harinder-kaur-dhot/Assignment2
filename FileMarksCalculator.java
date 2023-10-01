//create class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMarksCalculator {
    // Create main method
    public static void main(String[] arg) {
        int i = 0, choice; // counter or each line in the file and choice for menu
        boolean option = true;
        // declare a list to store data, the list is StudentData type
        List<StudentData> studentDetails = new ArrayList<>();
        // create exception handling
        try {
            File myFile = new File("prog5001_students_grade_2022.txt");
            Scanner myReader = new Scanner(myFile); // scanner method to read file
            System.out.println("file found");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                i++;
                if (i > 2) {
                    if (data.isBlank() || data.isEmpty() || data.startsWith("/"))
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
        }

        catch (

        FileNotFoundException e) {
            System.out.println("No file found");
        }

        while (option == true) {
            System.out.println("Welcome");
            System.out.println("Press 1 to print student deatils in a list.");
            System.out.println("Press 2 to print student deatils in a block.");
            System.out.println("Press 3 to get total marks.");
            System.out.println("Press 4 to get top 5 student's details with highest marks.");
            System.out.println("Press 5 to get the  Lowest scorer's details");
            System.out.println("Press 6 to exit");
            System.out.println("Please enter the valid option input");
            Scanner getChoice = new Scanner(System.in);
            choice = getChoice.nextInt();
            switch (choice) {
                case 1: {
                    for (i = 0; i < studentDetails.size(); i++) {
                        StudentData student = studentDetails.get(i);
                        System.out.println(
                                student.getfullName() + "   " + student.getStudentId() + "   " + student.getA1()
                                        + "   "
                                        + student.getA2() + "   " + student.getA3() + "   "
                                        + student.getTotalMarks());
                    }
                    break;
                }

                case 2: {
                    for (i = 0; i < studentDetails.size(); i++) {
                        StudentData student = studentDetails.get(i);
                        System.out.println("Name: " + student.getfullName());
                        System.out.println("Student ID: " + student.getStudentId());
                        System.out.println("Assignment 1: " + student.getA1());
                        System.out.println("Assignment 2: " + student.getA2());
                        System.out.println("Assignment 3: " + student.getA3());
                        System.out.println("Total Marks: " + student.getTotalMarks());
                        System.out.println();
                    }
                    break;
                }

                case 3: {
                    double threshold;
                    System.out.println("Please enter the marks threshold.");
                    Scanner sc = new Scanner(System.in);
                    threshold = sc.nextDouble();
                    for (i = 0; i < studentDetails.size(); i++) {
                        StudentData student = studentDetails.get(i);
                        if (student.getTotalMarks() < threshold) {
                            System.out.println("Name: " + student.getfullName());
                            System.out.println("Student ID: " + student.getStudentId());
                            System.out.println("Total Marks: " + student.getTotalMarks());
                            System.out.println();
                        }
                        sc.close();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Top 5 students who obtain highest marks: ");
                    // Lets first sort the list and then it will be esay to get top 5 and the lowest
                    for (i = 0; i < studentDetails.size()-1; i++) {
                        for (int j = 0; j < studentDetails.size(); j++) {
                            if (studentDetails.get(i).totalMarks < studentDetails.get(j).totalMarks) {
                                StudentData temp = studentDetails.get(i);
                                studentDetails.set(i, studentDetails.get(j));
                                studentDetails.set(j, temp);
                            }
                }
                StudentData student = studentDetails.get(i);
                        System.out.println("Name: " + student.getfullName());
                        System.out.println("Student ID: " + student.getStudentId());
                        System.out.println("Total Marks: " + student.getTotalMarks());
                        System.out.println();
            }
            for (i = 0; i < 5; i++) {
                        StudentData student = studentDetails.get(i);
                        System.out.println("Name: " + student.getfullName());
                        System.out.println("Student ID: " + student.getStudentId());
                        System.out.println("Total Marks: " + student.getTotalMarks());
                        System.out.println();
                    }

        }

                    break;

                case 5: {
                    System.out.print("Thank you");
                    System.exit(0);
                }
                    getChoice.close();

                default:
                    System.out.println("Please enter a valid option form 1 to 6.");
                    break;
                }
            }
        }
    }
