package Stack;
import java.util.Scanner;
public class stackex {
    private int[] stack;
    private int maxsize, tos = -1;

    void createSatack(int size) {
        stack = new int[size];
        maxsize = size;
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
        return (stack[tos]);
    }

    boolean isEmpty(){
        if(tos==-1){
            return true;
        }else{
            return false;
        }
    }  
    boolean isFull(){
        if(tos==maxsize-1){
            return true;
        }else{
            return false;
        }
    }
    void printStack(){
        for(int i=tos;i>=0;i--){
            System.out.println(stack[i]);
        }
    }


    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int ch, e;
        stackex stk=new stackex();
        System.out.println("Enter size of stack");
        int size= scn.nextInt();
        stk.createSatack(size);

        do{
            System.out.println("\n 1.push \n 2.pop \n 3.peek \n 4.print \n 0 Exit");
            ch=scn.nextInt();
            switch(ch){
                case 1:
                    if(stk.isFull()!=true){
                        System.out.println("Enter Element");
                        e=scn.nextInt();
                        stk.push(e);
                    }else{
                        System.out.println("Stack is Full");
                    }
                    break;
                case 2:
                    if(stk.isEmpty()!=true){
                        int temp=stk.pop();
                        System.out.println("Popped Element => "+temp);
                    }else{
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 3:
                    if(stk.isEmpty()!=true){
                        int temp=stk.peek();
                        System.out.println("peeked elem is=> "+temp);
                    }else{
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 4:
                    if(stk.isEmpty()!=true){
                        stk.printStack();
                    }else{
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 0:

                    break;
            }

        }while(ch!=0);


    }
}
