public class maximumSubarraySumDivisibleByK{
    public static void main(String[] args) {
        int[] arr9 = {1,2};
        System.out.println(maxSubarraySum(arr9, 1));
    }

    public static long maxSubarraySum(int [] nums , int k){
        long maxSubarraySum = Integer.MIN_VALUE;
        int n = nums.length;
        long sum = 0;

        for(int i = 0 ;i < n ; i++){
            sum = 0;
            for(int j = i;j < n;j++){
                sum += nums[j]; 

                int length = j - i +1;
                
                if(length % k == 0){
                    if(sum > maxSubarraySum){
                        maxSubarraySum = sum;
                    }
                }
                
            }
        }
        return maxSubarraySum;
    }
       
}
