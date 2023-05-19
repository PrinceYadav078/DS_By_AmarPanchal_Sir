package Practice;

import java.util.Scanner;

public class selectionsort {
    Scanner scn = new Scanner(System.in);

    void inputarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Elements");
            arr[i] = scn.nextInt();
        }
    }

    void Sel_Sort(int[] arr) {
        int min, pos;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos]=arr[i];
            arr[i]=min;
        }
    }

    void printarr(int[] arr) {
        System.out.println("After Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "=>");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        selectionsort obj = new selectionsort();
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        obj.inputarr(arr);
        obj.Sel_Sort(arr);
        obj.printarr(arr);
    }
}
