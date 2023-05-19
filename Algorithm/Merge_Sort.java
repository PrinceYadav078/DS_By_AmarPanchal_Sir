package Algorithm;

import java.util.Scanner;

public class Merge_Sort {
    public static void inputarr(int[] arr) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter arr Elements");
            arr[i] = scn.nextInt();
        }
    }

    public static int[] merge_Sort(int[] arr, int st, int end) {
        if (st == end) {
            int[] ba = new int[1];
            ba[0] = arr[st];
            return ba;
        }

        int mid = (st + end) / 2;
        int[] fsh = merge_Sort(arr, st, mid);
        int[] ssh = merge_Sort(arr, mid + 1, end);
        int[] fsa = mergetwosortedarr(fsh, ssh);

        return fsa;
    }

    public static int[] mergetwosortedarr(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        if (i == a.length) {
            while (j < b.length) {
                ans[k] = b[j];
                j++;
                k++;
            }
        } else if(j==b.length) {
            while (i < a.length) {
                ans[k] = a[i];
                i++;
                k++;
            }
        }

        return ans;

    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "=>");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        inputarr(arr);
        int []res=merge_Sort(arr, 0, arr.length - 1);
        printarr(res);
    }
}
