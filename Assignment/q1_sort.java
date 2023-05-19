package Assignment;
import java.util.Scanner;
public class q1_sort {
    static int count=0;
    public static void inputarr(int[] arr) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Elements");
            arr[i] = scn.nextInt();
        }
    }
    public static void BubbleSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                    count++;
                    
                }
            }
        }
        System.out.println("******************************************************");
        System.out.println("Total Swapping in Bubble Sort=> "+count);
        count=0;
    }
    public static void Sel_Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
            count++;
        }
        System.out.println("******************************************************");
        System.out.println("Total Swapping in Selection Sort=> "+count);
        count=0;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        BubbleSort(arr);
        Sel_Sort(arr);
    }
}
