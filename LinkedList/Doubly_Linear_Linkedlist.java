package LinkedList;
import java.util.Scanner;
class DNode{
    int data;
    DNode left,right;
    DNode(int e){
        data=e;
        left=right=null;
    }
}
public class Doubly_Linear_Linkedlist {
    DNode root;

    void createDlinkedlist() {
        root = null;
    }

    void insertLeft(int e){
        DNode n=new DNode(e);
        if(root==null){
            root=n;
        }else{
            n.right=root;
            root.left=n;
            root=n;
        }
    }
    void deleteLeft(){
        if(root==null){
            System.out.println("Empty List");

        }
        else{
            DNode t=root;
            root=root.right;
            root.left=null;
            System.out.println(t.data+" Deleted");
        }
    }

    void insertRight(int e){
        DNode n = new DNode(e);
        if (root == null) {
            root = n; // only for first means when we add first element
        } else {
            DNode t = root;
            while (t.right != null) {
                t = t.right;
            }
            t.right = n;
            n.left=t;
            System.out.println("Element Inserted on Right Side");
        }
    }

    void deleteRight(){
        if(root == null){
            System.out.println("Empty List");
        }else{
            DNode t=root;
            while(t.right!=null){
                t=t.right;
            }
            DNode t2=t.left;
            t2.right=null;
            System.out.println(t.data+" Deleted");
        }
    }
    void printList(){
        if(root == null){
            System.out.println("Empty List");
        }else{
            DNode t = root;
            while (t != null) {
                System.out.print(t.data+"=>");
                t = t.right;
            }
        }
    }
    void printReverse(){
        if(root==null){
            System.out.println("Empty List");
        }else{
            DNode t=root;
            while(t.right!=null){
                t=t.right;
            }
            while(t.left!=null){
                System.out.print(t.data+"=>");
                t=t.left;
            }
        }
    }
    public static void main(String args[]){
        int ch, e;
        Scanner scn = new Scanner(System.in);
        Doubly_Linear_Linkedlist obj = new Doubly_Linear_Linkedlist();
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
