package Exp1;

import java.util.Scanner;

public class SLLMain16Ques {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();
        SLLMain16Ques sllMain = new SLLMain16Ques();
        Scanner sigmaSkibidi = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            sllMain.menu();
            choice = sigmaSkibidi.nextInt();
            switch (choice) {
                case 1:
                    sigmaSkibidi.nextLine();
                    System.out.print("Enter NIM: ");
                    String nim = sigmaSkibidi.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sigmaSkibidi.nextLine();
                    System.out.print("Enter Class: ");
                    String kelas = sigmaSkibidi.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = sigmaSkibidi.nextDouble();
                    Student16 std = new Student16(nim, name, kelas, gpa);
                    sll.addFirst(std);
                    System.out.println(name+ "'s Data has been added.");
                    break;
                case 2:
                    sigmaSkibidi.nextLine();
                    System.out.print("Enter NIM: ");
                    nim = sigmaSkibidi.nextLine();
                    System.out.print("Enter Name: ");
                    name = sigmaSkibidi.nextLine();
                    System.out.print("Enter Class: ");
                    kelas = sigmaSkibidi.nextLine();
                    System.out.print("Enter GPA: ");
                    gpa = sigmaSkibidi.nextDouble();
                    std = new Student16(nim, name, kelas, gpa);
                    sll.addLast(std);
                    System.out.println(name+ "'s Data has been added.");
                    break;
                case 3:
                    sigmaSkibidi.nextLine();
                    System.out.print("Enter NIM: ");
                    nim = sigmaSkibidi.nextLine();
                    System.out.print("Enter Name: ");
                    name = sigmaSkibidi.nextLine();
                    System.out.print("Enter Class: ");
                    kelas = sigmaSkibidi.nextLine();
                    System.out.print("Enter GPA: ");
                    gpa = sigmaSkibidi.nextDouble();
                    std = new Student16(nim, name, kelas, gpa);
                    System.out.print("Enter Index: ");
                    int idx = sigmaSkibidi.nextInt();
                    sll.insertAt(idx, std);
                    System.out.println(name+ "'s Data has been added.");
                    break;
                case 4:
                    int idxFirst = sll.indexOf(sll.head.data.name);
                    Student16 removeDataFirst = sll.getData(idxFirst);
                    System.out.println(removeDataFirst.name + "'s data has been successfully removed.");
                    sll.removeFirst();
                    break;
                case 5:
                    int idxLast = sll.indexOf(sll.tail.data.name);
                    Student16 removedDataLast = sll.getData(idxLast);
                    System.out.println(removedDataLast.name + "'s data has been successfully removed.");
                    sll.removeLast();
                    break;
                case 6:
                    System.out.print("Enter Index: ");
                    idx = sigmaSkibidi.nextInt();
                    Student16 removeData = sll.getData(idx);
                    System.out.println(removeData.name + "'s data has been successfully removed.");
                    sll.removeAt(idx);
                    break;
                case 7:
                    sll.print();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (choice != 8);
        
    }

    public void menu() {
        System.out.println("Menu:");
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Add at Index");
        System.out.println("4. Remove First");
        System.out.println("5. Remove Last");
        System.out.println("6. Remove at Index");
        System.out.println("7. Print");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }
}
