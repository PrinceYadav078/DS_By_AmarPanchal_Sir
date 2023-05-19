package Assignment;
import java.util.Scanner;
class Student {
    private int Reg_no;
    String Name, Branch;
    float CGPA;

    public Student(int Reg_no, String Name, String Branch, float CGPA) {
        this.Reg_no = Reg_no;
        this.Branch = Branch;
        this.CGPA = CGPA;
        this.Name = Name;
    }
    int getReg_No() {
        return this.Reg_no;
    }
    float getcgpa() {
        return this.CGPA;
    }
    void Show_data() {
        System.out.println("*****************************************");
        System.out.println("Student Name   =>" + Name);
        System.out.println("Student Reg_NO =>" + Reg_no);
        System.out.println("Student Branch =>" + Branch);
        System.out.println("Student CGPA   =>" + CGPA);
    }
}
public class Q2 {
    public static int Lin_Search(Student[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i].getReg_No()) {
                return i;
            }
        }
        return -1;
    }

    public static void BubbleSort(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getReg_No() > arr[j + 1].getReg_No()) {
                    Student t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public static void BSearch(Student[] arr, int st, int end, int key) {
        if (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid].getReg_No() == key) {
                arr[mid].Show_data();
            } else if (key < arr[mid].getReg_No()) {
                BSearch(arr, st, mid - 1, key);
            } else if (key > arr[mid].getReg_No()) {
                BSearch(arr, mid + 1, end, key);
            }
        } else {
            System.out.println("Student Not Found");
        }

    }

    public static void Inser_Sort(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            Student new_ele = arr[i + 1];
            int j = i + 1;
            while (j > 0 && arr[j - 1].getcgpa() < new_ele.getcgpa()) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = new_ele;
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int n = scn.nextInt();
        int Reg_no, ch, key;
        String Name, Branch;
        float cgpa;
        Student std[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " Student Details");
            System.out.println("*****************************************");
            System.out.println("Enter Registration Number");
            Reg_no = scn.nextInt();
            System.out.println("Enter CGPA");
            cgpa = scn.nextFloat();
            scn.nextLine();
            System.out.println("Enter Name");
            Name = scn.nextLine();
            System.out.println("Enter Branch");
            Branch = scn.nextLine();
            std[i] = new Student(Reg_no, Name, Branch, cgpa);

        }
        do {
            System.out.println(
                    "\n1.Linear Search on Reg_No  \n2.Bubble Sort on Reg_No\n3Binary Search on Reg_no\n4Insertion Sort on CGPA\n0.Exit");
            ch = scn.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Registration Number for Search a Specific Student");
                    key = scn.nextInt();
                    int res = Lin_Search(std, key);
                    if (res != -1) {
                        std[res].Show_data();
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 2:
                    BubbleSort(std);
                    for (int i = 0; i < n; i++) {
                        std[i].Show_data();
                    }
                    break;
                case 3:
                    System.out.println("Enter Registration Number for Search a Specific Student");
                    key = scn.nextInt();
                    BSearch(std, 0, n - 1, key);
                    break;
                case 4:
                    Inser_Sort(std);
                    for (int i = 0; i < n; i++) {
                        std[i].Show_data();
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
