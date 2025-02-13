import java.util.Scanner;

public class Selection {
    static Scanner sigmaSkibidi = new Scanner(System.in);

    // Variables
    static double quizScore, assignmentScore, midTermScore, finalScore, finalGrade;
    static String alphabetic, qualification;

    public static void main(String[] args) {

        mainMenu();
        calculateFinalGrade();
        assignGradeAlphabet();

        System.out.println("===============================");
        if (finalGrade > 39 && finalGrade < 100) {
            System.out.println("Congratulations, you have passed! Here are the statistics of your Final Grade: ");
        } else if (finalGrade < 39 && finalGrade > 0) {
            System.out.println("Sorry, you have failed. Good luck next time. Here are the statistics of your Final Grade: ");
        } else {
            System.out.println("Invalid");
        }
        
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Alphabetic Grade: " + alphabetic);
        System.out.println("Qualification: " + qualification);
        System.out.println("===============================");
    }

    public static void mainMenu() {
        System.out.println("Final Grade Calculation Program");
        System.out.println("===============================");

        //If the one of the scores are not valid, loop this whole process until we get a valid input
        do {
            System.out.print("Input Assignment Score: ");
            assignmentScore = sigmaSkibidi.nextDouble();

            System.out.print("Input Quiz Score: ");
            quizScore = sigmaSkibidi.nextDouble();

            System.out.print("Input Mid Term Exam Score: ");
            midTermScore = sigmaSkibidi.nextDouble();

            System.out.print("Input Final Exam Score: ");
            finalScore = sigmaSkibidi.nextDouble();

            //Checking whether the score inputs are valid or no
            if (assignmentScore < 0 || assignmentScore > 100 || quizScore < 0 || quizScore > 100 || midTermScore < 0
            || midTermScore > 100 || finalScore < 0 || finalScore > 100) {
                System.out.println("Invalid score. Please input valid scores.");
            }

            System.out.println();
        } while (assignmentScore < 0 || assignmentScore > 100 || quizScore < 0 || quizScore > 100 || midTermScore < 0
                || midTermScore > 100 || finalScore < 0 || finalScore > 100);

    }

    public static void calculateFinalGrade() {
        finalGrade = ((quizScore * 0.20) + (assignmentScore * 0.20) + (midTermScore * 0.30) + (finalScore * 0.30));
    }

    public static void assignGradeAlphabet() {
        if (finalGrade > 80 && finalGrade <= 100) {
            alphabetic = "A";
            qualification = "Very good";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            alphabetic = "B+";
            qualification = "More than good";
        } else if (finalGrade > 65 && finalGrade <= 73) {
            alphabetic = "B";
            qualification = "Good";
        } else if (finalGrade > 60 && finalGrade <= 65) {
            alphabetic = "C+";
            qualification = "More than enough";
        } else if (finalGrade > 50 && finalGrade <= 60) {
            alphabetic = "C";
            qualification = "Enough";
        } else if (finalGrade > 39 && finalGrade <= 50) {
            alphabetic = "D";
            qualification = "Not enough";
        } else if (finalGrade <= 39) {
            alphabetic = "E";
            qualification = "Failed";
        } else {
            alphabetic = "invalid";
            qualification = "invalid";
        }
    }
}