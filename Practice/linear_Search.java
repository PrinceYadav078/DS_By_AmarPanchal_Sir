package Practice;
import java.util.Scanner;
public class linear_Search {
    Scanner scn = new Scanner(System.in);
    void inputarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Elements");
            arr[i] = scn.nextInt();
        }
    }
    int Lin_Search(int[]arr, int k){
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                return i+1;      
            }
        }
        return -1;    
    }

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int []arr=new int[n];
        linear_Search obj=new linear_Search();
        obj.inputarr(arr);
        System.out.println("Enter Key");
        int key=scn.nextInt();
        int res=obj.Lin_Search(arr, key);
        if(res!=-1){
            System.out.println("Key Found at "+res+ " Position");
        }else{
            System.out.println(key+" Not Found");
        }
    }
}
