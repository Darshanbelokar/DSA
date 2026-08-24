public class maximumSubarraySum {
  public static void main(String[] args) {
    int [] nums39 ={1,-3,2,3,-4};
    System.out.println(maximumsubarraySum(nums39));
  }

  public static int maximumsubarraySum(int[] nums){
    int currentSum = nums[0];
    int maxSubarraySum = nums[0];

    for(int i = 1;i < nums.length;i++){
      currentSum = Math.max(nums[i],currentSum + nums[i]);
      maxSubarraySum = Math.max(currentSum,maxSubarraySum);
    }
    return maxSubarraySum;
  } 
}
