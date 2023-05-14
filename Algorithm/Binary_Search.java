package Algorithm;
import java.util.Scanner;
public class Binary_Search {
    public static void inputarr(int[]arr){
        Scanner scn = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" Elements");
            arr[i]=scn.nextInt();
        }
    }
    public static void BSearch(int []arr,int st,int end,int key){
        if(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==key){
                System.out.println("key Found at "+(mid+1)+" Position");
            }else if(key<arr[mid]){
                BSearch(arr, st, mid-1, key);
            }else if(key>arr[mid]){
                BSearch(arr, mid+1, end, key);
            }
        }else{
            System.out.println("Key Not Found");
        }
        
    }

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        System.out.println("Enter key");
        int key=scn.nextInt();
        BSearch(arr, 0, n-1, key);
    }
}
