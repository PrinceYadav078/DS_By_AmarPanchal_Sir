package Practice;
import java.util.Scanner;
public class circularQueue {
    private int maxsize,rear,count,front,queue[];

    void createQueue(int size){
        maxsize=size;
        rear=-1;
        front=0;
        count=0;
        queue=new int[size];
    }

    void enqueue(int e){
        rear=(rear+1)%maxsize;
        queue[rear]=e;
        count++;
    }
    int dequeue(){
        int temp=queue[front];
        front=(front+1)%maxsize;
        count--;
        return temp;
    }
    boolean isEmpty(){
        if(count==0){
            return true;
        }else{
            return false;
        }
    }
    
    boolean isFull(){
        if(count==maxsize){
            return true;
        }else{
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
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        circularQueue obj = new circularQueue();
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
                        obj.printQueue();
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
