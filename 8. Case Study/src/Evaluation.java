public class Evaluation {

    Students std;
    Course crs;
    double JsScore;
    double MidTerms;
    double Finals;
    double FinalGrade;

    public Evaluation() {

    }

    public Evaluation(Students std, Course crs, double JsScore, double MidTerms, double Finals) {
        this.std = std;
        this.crs = crs;
        this.JsScore = JsScore;
        this.MidTerms = MidTerms;
        this.Finals = Finals;
    }

    public void printEvaluation() {
        System.out.println("Student ID: " + std.studentID);
        System.out.println("Student Name: " + std.studentName);
        System.out.println("Course Name: " + crs.CourseName);
        System.out.println("JS: " + JsScore);
        System.out.println("Midterms: " + MidTerms);
        System.out.println("Finals: " + Finals);
        System.out.println("Finals Grade: " + FinalGrade);
        System.out.println();
    }

    public double calculateFinalGrade(double JsScore, double MidTerms, double Finals) {
        return FinalGrade = (JsScore * 0.3) + (MidTerms * 0.3) + (Finals * 0.4);
    }

}