public class StudentData {
    public String firstName, lastName;
    public double a1, a2, a3, totalMarks;
    public int i, studentId;

    // create constructor

    public StudentData(String lastName, String firstName, String studentId, String a1, String a2, String a3) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = Integer.parseInt(studentId);
        this.a1 = Double.parseDouble(a1);
        this.a2 = Double.parseDouble(a2);
        this.a3 = Double.parseDouble(a3);

    }

    public double getTotalMarks() {
        return totalMarks = a1 + a2 + a3;
    }

    public String getfullName() {
        return firstName + " " + lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public double getA3() {
        return a3;
    }

    /*
     * public double getMinimumMarks(List<StudentData> studentDetails) {
     * for (i = 0; i <= studentDetails.size(); i++) {
     * 
     * }
     */

}
