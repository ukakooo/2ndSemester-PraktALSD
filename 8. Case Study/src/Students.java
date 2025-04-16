public class Students {
    String studentID;
    String studentName;

    public Students() {

    }

    public Students(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void printStudents() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println();
    }
}
