package Practice;

import java.util.Scanner;

public class bubblesort {
    Scanner scn = new Scanner(System.in);

    void inputarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Elements");
            arr[i] = scn.nextInt();
        }
    }

    void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
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
        bubblesort obj = new bubblesort();
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        obj.inputarr(arr);
        obj.BubbleSort(arr);
        obj.printarr(arr);
    }
}
