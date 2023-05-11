package Tree;

import java.util.Scanner;

class TNode {
    int key;
    TNode left, right;

    TNode(int key) {
        this.key = key;
        left = right = null;
    }
}

public class Tree_ex {
    private TNode root;
    static int count;

    Tree_ex() {
        root = null;
    }

    void insert(TNode r, TNode n) {
        if (root == null) {
            root = n;
        } else {
            if (n.key < r.key) {
                if (r.left == null) {
                    r.left = n;
                } else {
                    insert(r.left, n); // r.left becomes root now
                }
            } else {
                if (r.right == null) {
                    r.right = n;
                } else {
                    insert(r.right, n); // here r.right brcomes root
                }
            }
        }

    }

    void print_Inorder(TNode r) {
        if (r != null) {
            print_Inorder(r.left);
            System.out.print(r.key + "=>");
            print_Inorder(r.right);
        }
    }

    void Node_Count(TNode r) {
        if (r != null) {
            Node_Count(r.left);
            Tree_ex.count++;
            Node_Count(r.right);
        }
    }

    void Leaf_Node_Count(TNode r) {
        if (r != null) {
            Leaf_Node_Count(r.left);
            if (r.left == null && r.right == null) {
                Tree_ex.count++;
            }
            Leaf_Node_Count(r.right);
        }
    }

    public static void main(String args[]) {
        Tree_ex tobj = new Tree_ex();
        int ch, key;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("\n1.insert\n2print\n3.Node Count\n4.Leaf Node Count\n0.exit");
            ch = scn.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter key");
                    key = scn.nextInt();
                    TNode n = new TNode(key);
                    tobj.insert(tobj.root, n);
                    break;

                case 2:
                    tobj.print_Inorder(tobj.root);
                    break;
                case 3:
                    tobj.Node_Count(tobj.root);
                    System.out.println("Total Node =>" + Tree_ex.count);
                    Tree_ex.count = 0;
                    break;
                case 4:
                    tobj.Leaf_Node_Count(tobj.root);
                    System.out.println("Total Leaf Node =>" + Tree_ex.count);
                    Tree_ex.count = 0;
                    break;
                case 0:
                    break;
            }

        } while (ch != 0);
    }
}
