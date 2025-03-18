package Assignment;

public class Assignment {
    String name;
    int studentID;
    int  admissionYear;
    int midTermScore;
    int finalScore;

    public Assignment(String name, int studentID, int admissionYear, int midTermScore, int finalScore) {
        this.name = name;
        this.studentID = studentID;
        this.admissionYear = admissionYear;
        this.midTermScore = midTermScore;
        this.finalScore = finalScore;
    }
}