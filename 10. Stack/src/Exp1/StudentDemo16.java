package Exp1;

import java.util.Scanner;

public class StudentDemo16 {
    public static void main(String[] args) {
        StudentAssignmentStack16 stack = new StudentAssignmentStack16(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.print("Choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    Student16 student = new Student16(nim, name, className);
                    stack.push(student);
                    System.out.printf("%s's assignment has been successfully submitted!!\n", student.name);
                    break;
                case 2:
                    Student16 grading = stack.pop();
                    if (grading != null) {
                        System.out.println("Grading assignment from " + grading.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = scan.nextInt();
                        grading.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", grading.name, grade);
                    }
                    break;
                case 3:
                    Student16 peek = stack.peek();
                    if (peek != null) {
                        System.out.println("The last assignment was submitted by " + peek.name);
                    }
                    break;
                case 4:
                    System.out.println("List of all Assignments");
                    System.out.println("Name\tNIM\tClass Name");
                    stack.print();
                    break;
                default:
                    System.out.println("Choice is not valid.");
                    break;
            }
        } while (choice >= 1 && choice <= 4);
    }
}
