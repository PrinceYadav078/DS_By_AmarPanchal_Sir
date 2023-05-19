package Assignment;

import java.util.Scanner;
public class q1 {
    static int count=0;
   
    public static void inputarr(int[] arr) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Elements");
            arr[i] = scn.nextInt();
        }
    }
    public static int Lin_Search(int[]arr, int k){
        for(int i=0;i<arr.length;i++){
            count++;
            if(k==arr[i]){
                System.out.println("************************************************************");
                System.out.println("Total comparison in Linear Search=> "+count);
                count=0;
                return i+1;      
            }
        }
        return -1;    
    }

    public static void BSearch(int []arr,int st,int end,int key){
        if(st<=end){
            int mid=(st+end)/2;
            count++;
            if(arr[mid]==key){     
                System.out.println("Total comparison in Binary Search=> "+count);
                System.out.println("key Found at "+(mid+1)+" Position");
            }else if(key<arr[mid]){
                BSearch(arr, st, mid-1, key);
            }else if(key>arr[mid]){
                BSearch(arr, mid+1, end, key);
            }
        }else{
            System.out.println("Total comparison in Binary Search=> "+count);
            System.out.println("Key Not Found");
        }
        
    }
   

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        System.out.println("Enter Key");
        int key=scn.nextInt();
        int res=Lin_Search(arr, key);
        
        if(res!=-1){
            System.out.println("Key Found at "+res+ " Position");
        }else{
            System.out.println(key+" Not Found");
        }
        System.out.println("************************************************************");
        BSearch(arr, 0, n-1, key);
        q1.count=0;
        System.out.println("************************************************************");
        

    }
}
