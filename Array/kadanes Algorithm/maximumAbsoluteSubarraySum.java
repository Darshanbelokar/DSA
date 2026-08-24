public class maximumAbsoluteSubarraySum {
  public static void main(String[] args) {
    int [] arr8 = {1,-3,2,3,-4};
    System.out.println(maximumAbsolutesubarraySum(arr8));
  }

  public static int maximumAbsolutesubarraySum(int[] nums){
    int currSubarraySum = nums[0];
    int maxSubarraySum = nums[0];

    //Kadanes algo for maximum subarray sum
    for(int i = 1;i < nums.length;i++){
      currSubarraySum = Math.max(nums[i],currSubarraySum + nums[i]);
      maxSubarraySum = Math.max(currSubarraySum,maxSubarraySum);
    }

    //kadanes algo for minimum subarray sum
    int minSubarraySum = nums[0];
    currSubarraySum = nums[0];
    for(int i = 1;i < nums.length;i++){
      currSubarraySum = Math.min(nums[i],currSubarraySum + nums[i]);
      minSubarraySum = Math.min(currSubarraySum,minSubarraySum);
    }

    int result = Math.max(Math.abs(maxSubarraySum), Math.abs(minSubarraySum));

    return result;
  }  
}
