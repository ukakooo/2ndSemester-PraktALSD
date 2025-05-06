package Assignment;

public class ExcuseLetterStack16 {
    ExcuseLetter16 stack[];
    int top, size;

    public ExcuseLetterStack16(int size) {
        this.size = size;
        stack = new ExcuseLetter16[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push (ExcuseLetter16 excuse) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = excuse;
        }
    }

    public ExcuseLetter16 pop() {
        if (isEmpty()) {
            System.out.println("Stack is still empty!");
            return null;
        } else {
            ExcuseLetter16 excuse = stack[top];
            top--;
            return excuse;
        }
    }

    ExcuseLetter16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There are no data in the stack!!");
            return null;
        }
    }

    public ExcuseLetter16 searchByName(String name) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                return stack[i];
            }
        }
        return null;
    }
}
