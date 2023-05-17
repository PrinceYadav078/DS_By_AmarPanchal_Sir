package Algorithm;
import java.util.Scanner;
import java.util.Random;
import java.math.*;
public class bubblesort {
    public static void inputarr(int[]arr){
        Scanner scn = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            Random r =new Random();
            // System.out.println("Enter "+(i+1)+" Elements");
            arr[i]=r.nextInt(100);
            
        }
    }
    public static void BubbleSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
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
        BubbleSort(arr);
        printarr(arr);
    }
}
