import java.util.Scanner;

public class AcademicMains {

    static Scanner sigmaSkibidi = new Scanner(System.in);
    public static void main(String[] args) {

        // Input Students Data
        Students students[] = new Students[3];

        students[0] = new Students("22001", "Ali Rahman");
        students[1] = new Students("22002", "Budi Santoso");
        students[2] = new Students("22003", "Citra Dewi");

        // Input Course Data
        Course courses[] = new Course[3];

        courses[0] = new Course("MK001", "Struktur Data", 6);
        courses[1] = new Course("MK002", "Basis Data", 7);
        courses[2] = new Course("MK003", "Desain Web", 4);

        // Input Student Course and Data to evaulate
        Evaluation evals[] = new Evaluation[5];

        evals[0] = new Evaluation(students[0], courses[0], 80, 85, 90);
        evals[1] = new Evaluation(students[0], courses[1], 60, 75, 70);
        evals[2] = new Evaluation(students[1], courses[0], 75, 70, 80);
        evals[3] = new Evaluation(students[2], courses[1], 85, 90, 95);
        evals[4] = new Evaluation(students[2], courses[2], 80, 90, 65);
        
        for (Evaluation eval : evals) {
            eval.calculateFinalGrade(eval.JsScore, eval.MidTerms, eval.Finals);
        }

        AcademicMains academicMains = new AcademicMains();
        academicMains.mainMenu(students, courses, evals);
    }

    // Show Students Data
    public void showAllStudentData(Students[] students) {
        System.out.println("============== Students Data ==============");
        for (Students student: students) {
            student.printStudents();
        }
        System.out.println("===========================================");
    }

    public void showAllCourseData(Course[] courses) {
        System.out.println("============== Course Data ==============");
        for (Course course: courses) {
            course.printCourse();
        }
        System.out.println("=========================================");
    }
    
    public void showAllStudentEvaluations(Evaluation[] evals) {
        System.out.println("============== Evaluation Data ==============");
        for (Evaluation eval : evals) {
            eval.printEvaluation();
        }
        System.out.println("=============================================");
    }

    // Extra Features (Sorting, Searching)
    public void sortStudentsByFinalGrade(Evaluation[] eval) {
        for (int i = 0; i < eval.length; i++) {
            for (int j = 0; j < eval.length - i - 1; j++) {
                if (eval[j].FinalGrade > eval[j + 1].FinalGrade) {
                    Evaluation temp = eval[j];
                    eval[j] = eval[j + 1];
                    eval[j + 1] = temp;
                }
            }
        }

        System.out.println("=========== Sorted Data ===========");
        for (Evaluation evals : eval) {
            evals.printEvaluation();
        }
        System.out.println("===================================");
    }

    public int[] searchByNim(Evaluation[] eval, String search) {
        int[] pos = new int[eval.length];
        int count = 0;

        for (int i = 0; i < eval.length; i++) {
            if (eval[i].std.studentID.equals(search)) {
                pos[count] = i;
                count++;
            }
       }

       int[] result = new int[count];
       for (int i = 0; i < count; i++) {
            result[i] = pos[i];
       }
        return result;
    }

    public void printSearch(Evaluation[] eval, int[] result) {
        if (result.length != 0) {
            int studentPos = result[0];
            System.out.println("== SEARCH RESULT ==");
            System.out.println("NIM: " + eval[studentPos].std.studentID);
            System.out.println("Name: " + eval[studentPos].std.studentName);
            System.out.println();
            for (int i = 0; i < result.length; i++) {
                int idx = result[i];
                System.out.println("Course Name: " + eval[idx].crs.CourseName);
                System.out.println("JS: " + eval[idx].JsScore);
                System.out.println("Midterms: " + eval[idx].MidTerms);
                System.out.println("Finals: " + eval[idx].Finals);
                System.out.println("Finals Grade: " + eval[idx].calculateFinalGrade(eval[idx].JsScore, eval[idx].MidTerms, eval[idx].Finals));
                System.out.println();
            }
        } else {
            System.out.println("Data not found!");
        }
    }

    // Main Menu
    public void mainMenu(Students[] student, Course[] course, Evaluation[] eval) {
        while (true) {
            System.out.println("============== Main Menu ==============");
            System.out.println("1. Show All Student Data");
            System.out.println("2. Show All Course Data");
            System.out.println("3. Show All Student Evaluations");
            System.out.println("4. Sort Students by Final Grade");
            System.out.println("5. Search Students by Student ID");
            System.out.println("0. Exit");
            System.out.println("======================================");
            System.out.print("Choose Menu: ");
            int menu = sigmaSkibidi.nextInt();
            switch (menu) {
                case 1:
                    showAllStudentData(student);
                    break;
                case 2:
                    showAllCourseData(course);
                    break;
                case 3:
                    showAllStudentEvaluations(eval);
                    break;
                case 4:
                    sortStudentsByFinalGrade(eval);
                    sigmaSkibidi.nextLine();
                    break;
                case 5:
                    sigmaSkibidi.nextLine();
                    System.out.print("Enter Student ID: ");
                    String search = sigmaSkibidi.nextLine();
                    printSearch(eval, searchByNim(eval, search));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid Menu!");
                    break;
            }
        }
    }
}

