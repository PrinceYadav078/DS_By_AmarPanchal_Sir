package Queue;

import java.util.Scanner;

public class priorityQueue {
    private int rear, front, maxsize, queue[];

    void createqueue(int size) {
        maxsize = size;
        queue = new int[size];
        rear = -1;
        front = 0;
    }

    void enqueue(int e) {
        rear++;
        queue[rear] = e;
        // sort it using bubble sort
        for (int i = front; i < rear; i++) {
            for (int j = front; j < rear; j++) {
                if (queue[j] > queue[j + 1]) {
                    int t = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = t;
                }
            }
        }
    }

    int dequeue() {
        int temp = queue[front];
        front++;
        return temp;
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

    void printqueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int ch, e;
        System.out.println("Enter size of queue");
        int size = scn.nextInt();
        priorityQueue lque = new priorityQueue();
        lque.createqueue(size);

        do {
            System.out.println("\n 1.Enqueue \n 2.Dequeue \n 3.PrintQueue \n 0.Exit");
            ch = scn.nextInt();
            System.out.println("*********************************");
            switch (ch) {
                case 1:
                    if (lque.isFull() != true) {
                        System.out.println("Enter element");
                        e = scn.nextInt();
                        lque.enqueue(e);
                    } else {
                        
                        System.out.println("Queue is full");
                    }
                    break;
                case 2:
                    if (lque.isEmpty() != true) {
                        int temp = lque.dequeue();
                        System.out.println("Dequeue elem=> " + temp);
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;
                case 3:
                    if (lque.isEmpty() != true) {
                        lque.printqueue();
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;
                case 0:
                    break;
            }
        } while (ch != 0);
    }
}
