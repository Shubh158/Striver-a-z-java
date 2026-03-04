
package Arrays;

import java.util.Scanner;

public class LeftRotateByOnePlace {

    public static void leftrotatebyoneplace(int []nums,int n){
        int temp = nums[0];
        for(int i =1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1]=temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leftrotatebyoneplace(arr,n);
        System.out.println("Result5");

        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
