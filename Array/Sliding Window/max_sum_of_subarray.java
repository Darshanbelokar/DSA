public class max_sum_of_subarray {
  public static void main(String[] args) {
    int[] arr = {1,3,2,5,5,2};
    System.out.println(maximumSubarray(arr, 4));
  }

  public static long maximumSubarray(int[] nums,int k){
    int n = nums.length;
    int maxAns = 0;
    int windowSum = 0;

    for(int i=0;i<k;i++){
      windowSum += nums[i];
    }

    maxAns = windowSum;

    for(int j=k;j<n;j++){
      windowSum +=nums[j];
      windowSum -=nums[j-k];

      maxAns = Math.max(windowSum,maxAns);
    }

    return maxAns;
  }
}
