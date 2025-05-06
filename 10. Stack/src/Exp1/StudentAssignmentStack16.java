package Exp1;

public class StudentAssignmentStack16 {
    Student16[] stack;
    int top, size;

    StudentAssignmentStack16(int size) {
        this.size = size;
        top = -1;
        stack = new Student16[size];
    }

    boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Student16 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is full");
        }
    }
    
    Student16 pop() {
        if (!isEmpty()) {
            Student16 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in the stack!!");
            return null;
        }
    }

    Student16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There are no data in the stack!!");
            return null;
        }
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
        System.out.println("");
    }
}