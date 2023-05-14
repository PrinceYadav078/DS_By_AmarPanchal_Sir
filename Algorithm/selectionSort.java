package Algorithm;
import java.util.Scanner;
public class selectionSort {
    public static void inputarr(int[]arr){
        Scanner scn = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" Elements");
            arr[i]=scn.nextInt();
        }
    }
    public static void SelectionSort(int[]arr){
        int pos,min;
        for(int i=0;i<arr.length-1;i++){
            pos=i;
            min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    pos=j;
                }
            }
            arr[pos]=arr[i];
            arr[i]=min;   
        }
    }
    public static void printarr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"=>");
        }
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();
        int[]arr=new int[n];
        inputarr(arr);
        SelectionSort(arr);
        printarr(arr);
    }
}
