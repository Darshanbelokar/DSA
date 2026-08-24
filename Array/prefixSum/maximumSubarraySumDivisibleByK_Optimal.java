public class maximumSubarraySumDivisibleByK_Optimal {
  public static void main(String[] args) {
    int [] a ={1,2};
    int k = 1;

    System.out.println(maxSubarraySum(a, k));
  } 

  public static long maxSubarraySum(int[] nums,int k){
    int n = nums.length;
    
    long prefixSum[] = new long[n];
    prefixSum[0] = nums[0];

    for(int i = 1;i < n;i++){
      prefixSum[i] = prefixSum[i-1] + nums[i];
    }

    long result = Integer.MIN_VALUE;

    for(int start = 0;start < k;start++){
      long currSum = 0;
      
      int i = start;

      while(i < n && i+k-1 < n){
        int j = i+k-1;

        long subarraySum = prefixSum[j] - (i > 0 ? prefixSum[i-1] : 0 ); 

        currSum = Math.max(subarraySum,currSum + subarraySum);
        result = Math.max(result,currSum);

        i += k;
      }
    }
    return result;
  }
}
