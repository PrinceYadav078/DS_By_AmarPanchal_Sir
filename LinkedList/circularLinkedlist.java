package LinkedList;
import java.util.Scanner;
public class circularLinkedlist {
    Node root, last;

    void createClinkedlist() {
        root =last= null;
    }

    void insertLeft(int e) {
        Node n = new Node(e);
        if (root == null) {
            root=last = n; // only for first means when we add first element
        } else {
            n.next = root;
            root = n;
            last.next=root;
        }
        System.out.println("Element Inserted on Right Side");
    }

    void deleteLeft() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            Node t = root;
            if(root==last){
                root=last=null;
            }else{
                root = root.next;
                last.next=root;
            }
            
            System.out.println(t.data + "Deleted from left side");
        }
    }

    void insertRight(int e) {
        Node n = new Node(e);
        if (root == null) {
            root=last=n; // only for first means when we add first element
        } else {
           last.next=n;
           last=n;
           last.next=root;
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
            while (t!= last) {
                t2 = t;
                t = t.next;
            }
            if(root==last){
                root=last=null;
            }else{
                last=t2;
                last.next=root;
            }
            System.out.println(t.data + " deleted from rightside");
        }
    }

    void printList() {
        if (root == null) {
            System.out.println("Empty list");
        } else {
            Node t = root;
           do{
                System.out.print(t.data+"=>");
                t=t.next;
           }while(t!=root);
            
        }
    }

    public static void main(String args[]) {
        int ch, e;
        Scanner scn = new Scanner(System.in);
        circularLinkedlist obj = new circularLinkedlist();
        obj.createClinkedlist(); // root null

        do {
            System.out.println(
                    "\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n0.Exit\n:");
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
