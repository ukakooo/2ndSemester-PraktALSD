package Assignment;

public class LecturerMain {
    public static void main(String[] args) {
        // Adding lecturer Data
        LecturerData lecturer = new LecturerData();
        lecturer.add(new Lecturer("2201", "Alice", false, 25));
        lecturer.add(new Lecturer("2202", "Bob", true, 30));
        lecturer.add(new Lecturer("2203", "Charlie", false, 28));
        lecturer.add(new Lecturer("2204", "David", true, 35));
        lecturer.add(new Lecturer("2205", "Eve", false, 22));
        lecturer.add(new Lecturer("2206", "Sigma", true, 40));
        lecturer.add(new Lecturer("2207", "Mogger", false, 27));
        lecturer.add(new Lecturer("2208", "Aura", true, 32));
        lecturer.add(new Lecturer("2209", "Skibidi", false, 29));
        lecturer.add(new Lecturer("2210", "Mewing", true, 33));

        // Display original list
        System.out.println("Original Lecturer List:");
        lecturer.print();

        // Sorting lecturer by age in ascending order
        lecturer.sortAscending();
        System.out.println("\nSorted Lecturer List (by Age, ascending):");
        lecturer.print();
        System.out.println();

        //Sorting lecturer by age in descending order
        lecturer.sortDescending();
        System.out.println("\nSorted Lecturer List (by Age, descending):");
        lecturer.print();
        System.out.println();
    }
}
