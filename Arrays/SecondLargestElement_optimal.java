package Arrays;

import java.util.Scanner;

public class SecondLargestElement_optimal {
    //without sorting optimal approach better as it do it one pass
public static int Secondlargestelement(int []nums,int n){
    int largestelement=nums[0];
    int secondlargestelement=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        if(nums[i]>largestelement){
            secondlargestelement =largestelement;
            largestelement = nums[i];
        }else if(nums[i]<largestelement && nums[i]>secondlargestelement){
            secondlargestelement=nums[i];
        }

    }

    // handle duplicates
    if(secondlargestelement==Integer.MIN_VALUE){
        return -1;
    }
    return secondlargestelement;
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
        System.out.println(Secondlargestelement(arr,n));
    }
}
