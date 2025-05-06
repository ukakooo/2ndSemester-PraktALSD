package Assignment;

import java.util.Scanner;

public class ExcuseLetterMain16 {
    public static void main(String[] args) {
        ExcuseLetterStack16 stack = new ExcuseLetterStack16(5);
        Scanner sigmaSkibidi = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Name");
            System.out.print("Choice: ");
            choice = sigmaSkibidi.nextInt();

            switch (choice) {
                case 1:
                    sigmaSkibidi.nextLine();
                    System.out.print("Name: ");
                    String name = sigmaSkibidi.nextLine();
                    System.out.print("NIM: ");
                    String nim = sigmaSkibidi.nextLine();
                    System.out.print("Class Name: ");
                    String className = sigmaSkibidi.nextLine();
                    System.out.print("Type of excuse (Excused/Sick. Enter E or S): ");
                    char type = sigmaSkibidi.nextLine().charAt(0);
                    System.out.print("Duration: ");
                    int duration = sigmaSkibidi.nextInt();
                    ExcuseLetter16 excuse = new ExcuseLetter16(nim, name, className, type, duration);
                    stack.push(excuse);
                    System.out.printf("The excuse letter for %s has been submitted.\n", excuse.name);
                    break;
                case 2:
                    ExcuseLetter16 processed = stack.pop();
                    if (processed != null) {
                        System.out.printf("The excuse letter for %s has been processed.\n", processed.name);
                    }
                    break;
                case 3:
                    ExcuseLetter16 peek = stack.peek();
                    if (peek != null) {
                        System.out.println("The latest excuse latter was submitted by " + peek.name);
                    } else {
                        System.out.println("No excuse letters in the stack.");
                    }
                    break;
                case 4:
                    sigmaSkibidi.nextLine();
                    System.out.print("Searching for an Excuse letter by Name: ");
                    String nameSearch = sigmaSkibidi.nextLine();
                    ExcuseLetter16 searchResult = stack.searchByName(nameSearch);
                    if (searchResult != null) {
                        System.out.printf("Letter found: %s (%s), Type: %c, Duration: %d\n",
                            searchResult.name, searchResult.id, searchResult.typeOfExcuse, searchResult.duration);
                    } else {
                        System.out.println("Excuse letter not found.");
                    }
                    break;
                default:
                    System.out.println("Invalid Choice. Please enter a valid choice given by the menu.");
                    break;
            }
        } while (choice != 0);
    }
}
