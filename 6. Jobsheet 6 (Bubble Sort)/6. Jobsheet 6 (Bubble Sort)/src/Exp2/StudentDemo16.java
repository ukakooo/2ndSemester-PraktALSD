package Exp2;

public class StudentDemo16 {
    public static void main(String[] args) {
        TopStudents16 topStudents = new TopStudents16(5);

        // Adding student data
        topStudents.add(new Student16("2201", "Alice", "A", 3.9));
        topStudents.add(new Student16("2202", "Bob", "B", 3.7));
        topStudents.add(new Student16("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student16("2204", "David", "D", 3.6));
        topStudents.add(new Student16("2205", "Eve", "E", 4.0));

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
