package Assignment;

public class DoubleLinkedLists {

    Node head;
    Node tail;
    int size = 0;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                    size++;
                }
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Insertion failed. Data (" + key + ") not found!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double linked list is currently empty !!");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty !!");
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty !!");
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty !!");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                size--;
            }
        }
    }

    // Assignment section
    void insertAtIndex(Student data, int index) {
        if (index < 0) {
            System.out.println("Invalid index");
        } else if (isEmpty()) {
            addFirst(data);
        } else {
            Node temp = head;
            int i  = 0;
            while (temp != null && i < index - 1) {
                temp = temp.next;
                i++;
            }

            if (temp == null) {
                System.out.println("Index out of bounds.");
            } else if (temp == tail) {
                addLast(data);
            } else {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
                size++;
            }
        }
    }

    void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty !!");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data.nim.equalsIgnoreCase(key)) {
                    if (temp == tail) {
                        System.out.println("No data after " + key);
                    } else {
                        temp = temp.next;
                        temp.next = temp.next.next;
                        temp.next.prev = temp;
                        size--;
                    }
                    break;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Deletion failed. Data (" + key + ") not found!!");
            }
        }
    }

    void getFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty !!");
        } else {
            head.data.print();
        }
    }

    void getLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty !!");
        } else {
            tail.data.print();
        }
    }

    void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty !!");
        } else if (index < 0) {
            System.out.println("Invalid index.");
        } else if (index == 0) {
            getFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Index out of bounds.");
            } else {
                temp.data.print();
            }
        }
    }

    void getSize() {
        System.out.println("\nThe size of the linked list is: " + size);
    }

    int indexOf(String key) {
        Node temp = head;
        int index = 0;
        while (temp != null && !temp.data.nim.equalsIgnoreCase(key)) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }
}