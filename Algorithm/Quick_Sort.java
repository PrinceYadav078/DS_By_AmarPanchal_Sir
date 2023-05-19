package Algorithm;
import java.util.Scanner;
public class Quick_Sort {
    public static void inputarr(int[] arr) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter arr Elements");
            arr[i] = scn.nextInt();
        }
    }
    public static void quick_Sort(int[]arr,int st,int end){
        if(st>=end){
            return;
        }
        int pivot=arr[end];
        int pi =partition(arr, pivot, st, end);
        quick_Sort(arr, st, pi-1);
        quick_Sort(arr, (pi+1), end);
    }
    
    public static int partition(int[]arr,int p,int st,int end){
        int i=0,j=0;
        while(i<=end){
            if(arr[i]>p){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return (j-1);
    }
    public static void swap(int[]arr,int i ,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "=>");
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        inputarr(arr);
        quick_Sort(arr, 0, n-1);
        printarr(arr);
    }
}
