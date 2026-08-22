import java.io.*;

public class subarraySumEqualsK_BruteForce{

  public static void main(String[] args) throws Exception{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter no.of element: ");
    int n = Integer.parseInt(reader.readLine());

    System.out.print("Enter elements in the array:");
    String[] input = reader.readLine().split(" ");

    int arr[] = new int[n];

    for(int i = 0;i < n;i++){
      arr[i] = Integer.parseInt(input[i]);
    }
    int k = 2;

    int result = countSubarray(arr, k);
    System.out.println("Subarrays: " + result);  
    
  }

  public static int countSubarray(int[] nums,int k){

    int count = 0;
    int target = k;

    for(int i = 0;i < nums.length;i++){
      int sum = 0;
      for(int j = i;j < nums.length;j++){
        sum += nums[j];

        if(sum == target){
          count ++;
        }
      }
    }
    return count;
  }
}