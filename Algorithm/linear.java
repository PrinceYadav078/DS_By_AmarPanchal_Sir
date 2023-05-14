package Algorithm;
import java.util.Scanner;
public class linear {
    public static void inputarr(int[]arr){
        Scanner scn = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" Elements");
            arr[i]=scn.nextInt();
        }
    }
    public static int linearSearch(int []arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        System.out.println("Enter key");
        int key=scn.nextInt();
        int res=linearSearch(arr,key); 
        if(res!=-1){
            System.out.println("Key Found at "+(res+1)+ " Position");
        }else{
            System.out.println("Key Not Found");
        }
    }
}
