package Queue;

import java.util.Scanner;

public class circularQueue {
    private int maxsize, rear, front, count, queue[];

    void createQueue(int size) {
        maxsize = size;
        rear = -1;
        front = 0;
        count = 0;
        queue = new int[size];
    }

    void enqueue(int e) {
        rear = (rear + 1) % maxsize;
        count++;
        queue[rear] = e;
    }

    int dequeue() {
        int temp = queue[front];
        front = (front + 1) % maxsize;
        count--;
        return temp;
    }

    boolean isFull() {
        if (count == maxsize) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    void printQueue() {
        int c = 0;
        int i = front;
        while (c < count) {
            System.out.println(queue[i] + ", ");
            i = (i + 1) % maxsize;
            c++;
        }
    }

    public static void main(String args[]) {
        int ch, e, size;
        circularQueue obj = new circularQueue();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size:");
        size = scn.nextInt();
        obj.createQueue(size);
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
            ch = scn.nextInt();
            switch (ch) {
                case 1:
                    if (obj.isFull() != true)// not full
                    {
                        System.out.println("Enter element:");
                        e = scn.nextInt();
                        obj.enqueue(e);
                    } else {
                        System.out.println("Queue Full");
                    }
                    break;
                case 2:
                    if (obj.isEmpty() != true)// not Empty
                    {
                        e = obj.dequeue();
                        System.out.println("Element dequeued:" + e);
                    } else {
                        System.out.println("Queue Empty");
                    }
                    break;
                case 3:
                    if (obj.isEmpty() != true)// not Empty
                    {
                        System.out.println("Elements on queue");
                        obj.printQueue();
                    } else {
                        System.out.println("Queue Empty");
                    }
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
