package Practice;

import java.util.Scanner;

public class stackex {
   private int maxsize, tos, stack[];

    void createStack(int size) {
        stack = new int[size];
        maxsize = size;
        tos = -1;
    }

    void push(int e) {
        tos++;
        stack[tos] = e;
    }

    int pop() {
        int temp = stack[tos];
        tos--;
        return temp;
    }

    int peek() {
        return stack[tos];
    }

    boolean isEmpty() {
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (tos == maxsize - 1) {
            return true;
        } else {
            return false;
        }
    }

    void printStack() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(stack[i] + "=> ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        stackex obj = new stackex();
        System.out.println("Enter Size");
        int n = scn.nextInt();
        obj.createStack(n);
        int ch, e;
        do {
            System.out.println("\n1.Push\n2.Pop\n3Peek\n4Print\n0.Exit");
            ch = scn.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Element");
                    e = scn.nextInt();
                    if (obj.isFull() != true) {
                        obj.push(e);
                    } else {
                        System.out.println("Stack is Full");
                    }
                    break;

                case 2:
                    if (obj.isEmpty() != true) {
                        int temp = obj.pop();
                        System.out.println("Popped Element=> " + temp);
                    } else {
                        System.out.println("Stack is Empty");
                    }
                    break;

                case 3:
                    if (obj.isEmpty() != true) {
                        int temp = obj.peek();
                        System.out.println("Peeked Element=> " + temp);
                    } else {
                        System.out.println("Stack is Empty");
                    }
                    break;

                case 4:
                    if (obj.isEmpty() != true) {
                        obj.printStack();
                    } else {
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }

        } while (ch != 0);
    }
}
