package Assignment;

public class Queue {
    Node front, rear;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("The Queue has been cleared.");
    }

    void enqueue (Student std) {
        Node newNode = new Node(std, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Calling the next Student: ");
            Student removed = front.next.data;
            removed.print();

            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    void print() {
        Node tmp = front;
        System.out.println("Queue data:");
        while (tmp != null) {
            tmp.data.print();
            tmp = tmp.next;
        }
    }

    void printFrontRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front: ");
            front.data.print();
            System.out.println("Rear: ");
            rear.data.print();
        }
    }

    void printSize() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("The total students that has enqueued to the Queue is: " + size);
        }
    }
}
