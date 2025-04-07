package Assignment;

import java.util.Scanner;

public class LecturerMain {
    public static void main(String[] args) {

        Scanner sigmaSkibidi = new Scanner(System.in);

        // Adding lecturer Data
        LecturerData lecturer = new LecturerData();
        lecturer.add(new Lecturer("2201", "Alice", false, 25));
        lecturer.add(new Lecturer("2202", "Bob", true, 30));
        lecturer.add(new Lecturer("2203", "Charlie", false, 28));
        lecturer.add(new Lecturer("2204", "David", true, 35));
        lecturer.add(new Lecturer("2205", "Eve", false, 22));
        lecturer.add(new Lecturer("2206", "Sigma", true, 40));
        lecturer.add(new Lecturer("2207", "Mogger", false, 27));
        lecturer.add(new Lecturer("2208", "Aura", true, 30));
        lecturer.add(new Lecturer("2209", "Skibidi", false, 29));
        lecturer.add(new Lecturer("2210", "Mewing", true, 30));

        // Display original list
        // System.out.println("-------------------------------------");
        // System.out.println("Original Lecturer List:");
        // lecturer.print();

        // Sorting the data ascendingly
        System.out.println("-------------------------------------");
        System.out.println("Sorted Lecturer Data Ascendingly");
        lecturer.sortAscending();
        lecturer.print();

        //Finding Lecturer by Name using Sequential Search
        System.out.println("-------------------------------------");
        System.out.print("Input Lecturer's Name: ");
        String name = sigmaSkibidi.nextLine();

        System.out.println("-------------------------------------");
        System.out.println("_____________________________________");
        System.out.print("Search lecturer by name using Sequential Search: ");

        int position = lecturer.findSeqSearch(name);
        lecturer.showPositionNameSearch(name, position);
        lecturer.showDataNameSearch(name, position);
        System.out.println("-------------------------------------");

        //Finding Lecturer by Age using Binary Search
        System.out.println("-------------------------------------");
        System.out.print("Input Lecturer's Age: ");
        int age = sigmaSkibidi.nextInt();
        lecturer.findLecturerByAge(age, 0, 0);
        
    }
}
