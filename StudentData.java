
public class StudentData {
    public String firstName, lastName;
    public int studentId, a1, a2, a3, totalMarks;

    //create constructor

    public StudentData(String firstName, String lastName, String studentId, String a1, String a2, String a3)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = Integer.parseInt(studentId);
        this. a1 = Integer.parseInt(a1);
        this.a2 = Integer.parseInt(a2);
        this.a3 = Integer.parseInt(a3);
    }

    public void getMinimumMarks()
    {

    }

    public void getMaximumMarks()
    {

    }

    public void printDetails()
    {

    }
}
