package Exp1;

public class SLLMain16_Mod {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();

        Student16 std1 = new Student16("001", "Student 1", "TI-1I", 3.89);
        Student16 std2 = new Student16("002", "Student 2", "TI-1I",  3.45);
        Student16 std3 = new Student16("003", "Student 3", "TI-1I", 3.20);
        Student16 std4 = new Student16("004", "Student 4", "TI-1I", 3.00);

        sll.addFirst(std1);
        sll.addFirst(std2);
        sll.addFirst(std3);
        sll.addFirst(std4);

        System.out.println("Data at index 1 is:");
        Student16 data = sll.getData(1);
        data.print();
        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
