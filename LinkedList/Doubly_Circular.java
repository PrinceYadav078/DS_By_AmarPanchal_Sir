package LinkedList;

import java.util.Scanner;

public class Doubly_Circular {
    DNode root, last;

    void createDlinkedlist() {
        root = last = null;
    }

    void insertLeft(int e) {
        DNode n = new DNode(e);
        if (root == null) {
            root = last = n;
            root.right = root;
            root.left = root;
        } else {
            n.right = root;
            root.left=n;
            root = n;
            root.left = last;
            last.right = root;
        }
        System.out.println(root.data + " Inserted from left");
    }

    void deleteLeft() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            if (root == last) {
                root = last = null;
            } else {
                DNode t = root;
                t = t.right;
                root = t;
                root.left = last;
                last.right = root;

            }
            System.out.println(" deleted from left");
        }

    }

    void insertRight(int e) {
        DNode n = new DNode(e);
        if (root == null) {
            root = last = n;
            root.right = root;
            root.left = root;
        } else {
            last.right = n;
            n.left = last;
            last = n;
            last.right = root;
            root.left = last;
        }
        System.out.println(last.data + " Added on right");
    }

    void deleteRight() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            if (root == last) {
                root = last = null;
            } else {
                DNode t = last;
                t = t.left;
                last = t;
                root.left = last;
                last.right = root;
            }

            System.out.println(" deleted from right");
        }

    }

    void printList() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            DNode t = root;
            do {
                System.out.print(t.data + "=>");
                t = t.right;

            } while (t.left != last);
        }
    }
    void printReverse(){
        if (root == null) {
            System.out.println("Empty List");
        } else {
            DNode t = last;
            do {
                System.out.print(t.data + "=>");
                t = t.left;

            } while (t.right != root);
        }
    }

    public static void main(String args[]) {
        int ch, e;
        Scanner scn = new Scanner(System.in);
        Doubly_Circular obj = new Doubly_Circular();
        obj.createDlinkedlist(); // root null

        do {
            System.out.println(
                    "\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n6 printReverse\n0.Exit\n:");
            ch = scn.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Element");
                    e = scn.nextInt();
                    obj.insertLeft(e);
                    break;
                case 2:
                    System.out.println("Enter Element");
                    e = scn.nextInt();
                    obj.insertRight(e);
                    break;
                case 3:
                    obj.deleteLeft();
                    break;
                case 4:
                    obj.deleteRight();
                    break;
                case 5:
                    obj.printList();
                    break;
                case 6:
                    obj.printReverse();
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
                case 0:
                    System.out.println("Exiting ");
                    break;

            }

        } while (ch != 0);

    }
}
