package Stack;

import java.util.Scanner;

public class braces {
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

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        braces stk = new braces();
        System.out.println("Enter Braces Sequence");
        String str = scn.nextLine();
        stk.createSatack(str.length());
        boolean res = isvalid(str, stk);
        if (res == true) {
            System.out.println("Valid braces Sequence");
        } else {
            System.out.println("NOt Valid braces Sequence");
        }
    }

    public static boolean isvalid(String str, braces stk) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stk.push(ch);
            } else {
                if (stk.isEmpty()) {
                    return false;
                }
                if (ch == '}' && stk.peek() != '{') {
                    return false;
                } else if (ch == ']' && stk.peek() != '[') {
                    return false;
                } else if (ch == ')' && stk.peek() != '(') {
                    return false;
                } else {
                    stk.pop();
                }
            }
        }
        return stk.isEmpty();

    }
}
