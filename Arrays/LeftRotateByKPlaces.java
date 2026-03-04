package Arrays;

import java.util.Scanner;

public class LeftRotateByKPlaces {

    public static void leftrotate(int[] nums, int K) {
        int n = nums.length;
        K = K % n;
        int[] temp = new int[n];
        for(int i = 0;i<K;i++){
            temp[i] = nums[i];
        }
        for(int i =K;i<n;i++){
            nums[i-K] = nums[i];
        }
        for(int i = n-K;i<n;i++){
            nums[i] = temp[i-(n-K)];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
         System.out.print("Enter the number by which you have to rotate  ");
        int K = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leftrotate(arr,K);
        System.out.println("Result5");

        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
    
}
