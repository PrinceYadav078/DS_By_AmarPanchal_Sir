package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next; // self reference

    Node(int e) {
        data = e;
        next = null;
    }
}

public class linearlinkedlist {
    Node root;

    void createlinkedlist() {
        root = null;
    }

    void insertLeft(int e) {
        Node n = new Node(e);
        if (root == null) {
            root = n; // only for first means when we add first element
        } else {
            n.next = root;
            root = n;
        }
        System.out.println("Element Inserted on Right Side");
    }

    void deleteLeft() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            Node t = root;
            root = root.next;
            System.out.println(t.data + "Deleted from left side");
        }
    }

    void insertRight(int e) {
        Node n = new Node(e);
        if (root == null) {
            root = n; // only for first means when we add first element
        } else {
            Node t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
            System.out.println("Element Inserted on Right Side");
        }
    }

    void deleteRight() {
        if (root == null) {
            System.out.println("Empty list");
        }
         else {
            Node t = root;
            Node t2 = t;
            while (t.next != null) {
                t2 = t;
                t = t.next;
            }
            t2.next = null;
            if(t==root){
                root=null;
            }
            System.out.println(t.data + " deleted from rightside");
        }
    }

    void insertAt(int e, int index) {
        if (root == null) {
            System.out.println("Empty list");
        } else {
            Node n = new Node(e);
            if (index == 0) { // before root left most
                n.next = root;
                root = n;
            } else {
                Node t = root;
                while (t != null && index > 1) {
                    index--;
                    t = t.next;
                }
                if (t == null) {
                    System.out.println("Index Out of bound ");
                } else {
                    n.next = t.next;
                    t.next = n;
                }
            }

        }
    }

    void deleteElement(int e) {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            Node t = root;
            Node t2 = t;
            while (t != null && t.data != e) {
                t2 = t;
                t = t.next;
            }
            if (t == null) {
                System.out.println("Element Not Found");
            } else {
                System.out.println("Element Found");
                if (t == root) { // leftmost
                    root = root.next;
                } else if (t.next == null) { // rightmost
                    t2.next = null;
                } else { // inbetween
                    t2.next = t.next;
                }
                System.out.println(t.data + " Deleted");
            }
        }
    }

    void printList() {
        if (root == null) {
            System.out.println("Empty list");
        } else {
            Node t = root;
            while (t != null) {
                System.out.print(t.data+"=>");
                t = t.next;
            }
        }
    }

    void searchList(int k) {
        if (root == null) {
            System.out.println("Empty list");
        } else {
            Node t = root;
            while (t != null && t.data != k) {
                t = t.next;
            }
            if (t == null) {
                System.out.println("Not Found");
            } else {
                System.out.println("Element present in List");
            }
        }
    }

    public static void main(String args[]) {
        int ch, e;
        Scanner scn = new Scanner(System.in);
        linearlinkedlist obj = new linearlinkedlist();
        obj.createlinkedlist(); // root null

        do {
            System.out.println(
                    "\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n6.Search \n7InsertAt\n8Delete_Element\n0.Exit\n:");
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
                    System.out.println("Enter Element");
                    e = scn.nextInt();
                    obj.searchList(e);
                    break;
                case 7:
                    System.out.println("Enter element");
                    e = scn.nextInt();
                    System.out.println("enter index");
                    int index = scn.nextInt();
                    obj.insertAt(e, index);
                    break;
                case 8:
                    System.out.println("Enter element");
                    e = scn.nextInt();
                    obj.deleteElement(e);
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
