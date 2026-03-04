package Arrays;

import java.util.Scanner;

public class LargestElement {

    public static int largestelement(int []nums,int n){
    int max = Integer.MIN_VALUE;
    for(int i =0;i<n;i++){
        if(max<nums[i]){
            max = nums[i];
        }
    }
    return max;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestelement(arr,n));
    }

}
