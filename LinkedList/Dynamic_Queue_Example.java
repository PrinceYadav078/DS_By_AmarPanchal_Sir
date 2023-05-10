package LinkedList;
import java.util.Scanner;
public class Dynamic_Queue_Example {
    Node front, rear;

    void createQueue() {
        rear = front = null;
    }

    void Enqueue(int e) {
        Node n = new Node(e);
        if (rear == null)
            rear =front= n;
        else {
            rear.next=n;
            rear=n;
            System.out.println("inserted");
        }
    }

    void Dequeue() {
        if (front == null)
            System.out.println("Empty Queue");
        else {
            Node t=front;
            front=front.next;
            // if(front==null){
            //     rear=null;     this if condition make circular Queue
            // }
            System.out.println(t.data + " deleted");
        }
    }

    void printQueue() {
        if (front == null)
            System.out.println("Empty Queue");
        else {
            Node t = front;
            while (t != null)
            {
                System.out.print("| " +t.data + " |");
                t = t.next;
            }
        }
    }

    public static void main(String args[]) {
        int ch,e;
        Scanner scn= new Scanner(System.in);
        Dynamic_Queue_Example obj=new Dynamic_Queue_Example();
        obj.createQueue();
        do{
            System.out.println("\n 1.Enqueue \n 2.Dequeue \n 3.PrintQueue \n 0.Exit");
            ch=scn.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Elements");
                    e=scn.nextInt();
                    obj.Enqueue(e);
                    break;
                case 2:
                    obj.Dequeue();
                    break;
                case 3:
                    obj.printQueue();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }while(ch!=0);
    }
}