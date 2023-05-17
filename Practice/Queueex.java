package Practice;

import java.util.Scanner;

public class Queueex {
    private int maxsize, rear, front, queue[];

    void createQueue(int size) {
        maxsize = size;
        rear = -1;
        front = 0;
        queue = new int[size];
    }

    void enqueue(int e) {
        queue[++rear] = e;
    }

    int dequeue() {
        return queue[front++];
    }

    boolean isFull() {
        if (rear == maxsize - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (front > rear) {
            return true;
        } else {
            return false;
        }
    }

    void PrintQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "=>");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queueex obj = new Queueex();
        System.out.println("Enter Size");
        int n = scn.nextInt();
        obj.createQueue(n);
        int ch, e;
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3Print\n0.Exit");
            ch = scn.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Element");
                    e = scn.nextInt();
                    if (obj.isFull() != true) {

                        obj.enqueue(e);
                    } else {
                        System.out.println("Queue is Full");
                    }
                    break;

                case 2:
                    if (obj.isEmpty() != true) {
                        int temp = obj.dequeue();
                        System.out.println("Dequeue Element=> " + temp);
                    } else {
                        System.out.println("Queue is Empty");
                    }
                    break;

                case 3:
                    if (obj.isEmpty() != true) {
                        obj.PrintQueue();
                    } else {
                        System.out.println("Queue is Empty");
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
