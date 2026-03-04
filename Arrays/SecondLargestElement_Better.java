package Arrays;
import java.util.Scanner;

public class SecondLargestElement_Better{
public static int Secondlargestelement(int []nums,int n){
    int largestelement=nums[0];
    int secondlargestelement=Integer.MIN_VALUE;

    //first pass --TC--O(N)
    for(int i=0;i<n;i++){
        if(nums[i]>largestelement){
            largestelement = nums[i];
    
    }
}
    //second pass -- TC--O(N)
    for(int i=0;i<n;i++){
        if(nums[i]!=largestelement && nums[i]>secondlargestelement){
            secondlargestelement = nums[i];
    
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