package StackExample;

public interface Stack {
    int size = 5;

    void push(int element);
    void pop();
    void display();
    boolean overflow();
    boolean underflow();
}
