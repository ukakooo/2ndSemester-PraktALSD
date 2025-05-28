package Assignment;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();

        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
        dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
        dll.print();

        System.out.println("Insert Hartono at Index 3");
        dll.insertAtIndex(new Student("???", "Hartono", "TI-1I", 3.89), 3);
        dll.print();

        System.out.println("Deleting Hartono");
        dll.removeAfter("111");
        dll.print();
        System.out.println("\nGetting the First Data");
        dll.getFirst();
        System.out.println("\nGetting the Last Data");
        dll.getLast();
        System.out.println("\nGetting the Data at Index 3");
        dll.getIndex(3);

        dll.getSize();
        System.out.println("Herco's data is placed at the index of: " + dll.indexOf("113"));
    }
}
