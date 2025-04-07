package Exp2;

import java.util.Scanner;

public class StudentDemo16Scanner {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        System.out.print("Input the number of students to input: ");
        int n = sigmaSkibidi.nextInt();
        TopStudents16 topStudents = new TopStudents16(n);

        // Adding student data
        for (int i = 0; i < n; i++) {
            System.out.println("Input student data " + (i + 1));
            System.out.print("NIM: ");
            String nim = sigmaSkibidi.next();
            System.out.print("Name: ");
            String name = sigmaSkibidi.next();
            System.out.print("Class: ");
            String studentClass = sigmaSkibidi.next();
            System.out.print("GPA: ");
            double gpa = sigmaSkibidi.nextDouble();
            topStudents.add(new Student16(nim, name, studentClass, gpa));
        }

        // Display original List
        System.out.println("Original student List:");
        topStudents.print();

        // Sorting students by GPA using Bubble Sort
        topStudents.bubbleSort();
        System.out.println("\nSorted student List (by GPA, descending):");
        topStudents.print();

        // Sorting students by GPA using Selection Sort
        topStudents.selectionSort();
        System.out.println("\nSorted student List (by GPA, ascending) using Selection sort");
        topStudents.print();

        // Sorting students by GPA using Insertion Sort
        topStudents.insertionSort();
        System.out.println("\nSorted student List (by GPA, ascending) using Insertion Sort:");
        topStudents.print();

        //Sorting students by GPA using Insert Sort but Descending
        topStudents.insertionSortDescending();
        System.out.println("\nSorted student List (by GPA, descending) using Insertion Sort:");
        topStudents.print();
    }
}
