package Stack;
import java.util.Scanner;
public class reversestr {
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
            System.out.println( (char) stack[i]);
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scn.nextLine();
        reversestr stk=new reversestr();
        stk.createSatack(str.length());
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            stk.push(ch);
        }
        stk.printStack();
    }
}
