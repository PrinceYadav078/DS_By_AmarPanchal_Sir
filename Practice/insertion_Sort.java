package Practice;
import java.util.Scanner;
public class insertion_Sort {
    Scanner scn = new Scanner(System.in);

    void inputarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Elements");
            arr[i] = scn.nextInt();
        }
    }
    void Inser_Sort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int new_ele=arr[i+1];
            int j=i+1;
            while(j>0&&arr[j-1]>new_ele){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=new_ele;
        }

    }

    void printarr(int[] arr) {
        System.out.println("After Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "=>");
        }
    }

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        insertion_Sort obj = new insertion_Sort();
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        obj.inputarr(arr);
        obj.Inser_Sort(arr);
        obj.printarr(arr);
    }
}
