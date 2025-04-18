package StackExample;

public class IntegerStack implements Stack {
    private int[] stack = new int[size];
    private int top = -1;

    
    public void push(int element) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    
    public void pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Nothing to pop.");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }


    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }


    public boolean overflow() {
        return top == size - 1;
    }

    
    public boolean underflow() {
        return top == -1;
    }
}
