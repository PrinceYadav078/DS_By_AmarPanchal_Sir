package LinkedList;

import java.util.Scanner;

public class DynamicStackExample {
    Node tos;

    void createStack() {
        tos = null;
    }

    void Push(int e) {
        Node n = new Node(e);
        if (tos == null)
            tos = n;// only for 1st
        else {
            n.next = tos;// 1
            tos = n;// 2
            System.out.println("Pushed");
        }
    }

    void Pop() {
        if (tos == null)
            System.out.println("Empty Stack");
        else {
            Node t = tos;
            tos = tos.next;
            System.out.println("Poped:" + t.data);
        }
    }

    void peek() {
        if (tos == null) {
            System.out.println("Empty Stack");
        } else {
            System.out.println("At peek we have => " + tos.data);
        }
    }

    void printStack() {
        if (tos == null)
            System.out.println("Empty Stack");
        else {
            Node t = tos;// 1
            while (t != null)// 2
            {
                System.out.println(t.data);
                t = t.next;
            }
        }
    }

    public static void main(String args[]) {
        int ch, e;
        DynamicStackExample obj = new DynamicStackExample();
        Scanner in = new Scanner(System.in);
        obj.createStack();
        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.Push(e);
                    break;
                case 2:
                    obj.Pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.printStack();
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
                case 0:
                    System.out.println("Exiting ");
                    break;
            }// switch
        } while (ch != 0);

    }
}