public class Course {
    String CourseCode;
    String CourseName;
    int sks;
    
    public Course() {

    }

    public Course(String CourseCode, String CourseName, int sks) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.sks = sks;
    }

    public void printCourse() {
        System.out.println("Course Code: " + CourseCode);
        System.out.println("Course Name: " + CourseName);
        System.out.println("SKS: " + sks);
        System.out.println();
    }
}