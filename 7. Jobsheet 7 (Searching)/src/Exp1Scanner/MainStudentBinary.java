package Exp1Scanner;
import java.util.Scanner;

public class MainStudentBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        SearchStudents data = new SearchStudents();
        System.out.print("Input the amount of students you want to add: ");
        int amountStudent = s.nextInt();
        data.StudentAmount(amountStudent);

        System.out.println("-------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("-----------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Name\t: ");
            String name = s1.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        // Displaying the datas
        System.out.println("-------------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        // Search students by the NIM
        System.out.println("-------------------------------------");
        System.out.println("_____________________________________");
        System.out.print("Search students by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search, position);
        // Search students using Binary Search
        System.out.println("-------------------------------------");
        System.out.println("_____________________________________");
        System.out.print("Search student by NIM: ");
        System.out.println("Using binary search");
        int position1 = data.FindBinarySearch(search, 0, amountStudent - 1);

        data.showPosition(search, position1);
        data.showData(search, position1);
    }
}
