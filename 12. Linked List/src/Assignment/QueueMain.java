package Assignment;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        Queue queue = new Queue();
        QueueMain queueMain = new QueueMain();
        int choice;

        do {
            queueMain.menu();
            choice = sigmaSkibidi.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Register your information: ");
                    sigmaSkibidi.nextLine();
                    System.out.print("Enter NIM: ");
                    String nim = sigmaSkibidi.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sigmaSkibidi.nextLine();
                    System.out.print("Enter Study Program: ");
                    String studyProgram = sigmaSkibidi.nextLine();
                    System.out.print("Enter Class Name: ");
                    String className = sigmaSkibidi.nextLine();
                    
                    Student std = new Student(nim, name, studyProgram, className);
                    queue.enqueue(std);
                    System.out.println(name + "'s data has been successfully registered.");
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;
                case 4:
                    System.out.println("Queue is not full."); //LinkedList is never full
                    break;
                case 5:
                    queue.clear();
                    break;
                case 6:
                    queue.printFrontRear();
                    break;
                case 7:
                    queue.printSize();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    break;
            }
        } while (choice != 8);
    }

    public void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Register Student (Enqueue)");
        System.out.println("2. Call Next Student (Dequeue)");
        System.out.println("3. Check if Queue is Empty");
        System.out.println("4. Check if Queue is Full");
        System.out.println("5. Clear Queue");
        System.out.println("6. Display Front and Rear Student");
        System.out.println("7. Total Students in the Queue");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }
}
