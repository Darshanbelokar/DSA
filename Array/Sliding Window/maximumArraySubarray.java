public class maximumArraySubarray{
  public static void main(String[] args) {
    int [] nums1 ={1,12,-5,-6,50,3};
    int k = 4;

    System.out.println(findMaxAverage(nums1, k));
  }

  public static double findMaxAverage(int[] nums,int k){
    int left = 0;
    int right = k - 1;  
    double maxAverage = 0;
    double sum = 0;


    for(int i = 0;i < k ;i++){
      sum += nums[i];
    }

    maxAverage = sum / k;

    while(right < nums.length - 1){
      sum = sum - nums[left] + nums[right+1];

      left++;
      right++;

      double Updated_maxAverage = sum / k;

      maxAverage = Math.max(Updated_maxAverage,maxAverage);

    }
    return maxAverage;
  }
}