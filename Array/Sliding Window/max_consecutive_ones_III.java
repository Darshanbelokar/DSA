public class max_consecutive_ones_III {
  public static void main(String[] args) {
    int[] arr1 = {1,0,1,1,1,0,1};
    int k = 1;

    System.out.println(longestOnes(arr1,k));
  }

  public static int longestOnes(int[] nums,int k){
    int left = 0;
    int maxLength = 0;
    int zerCount = 0;

    for(int right = 0;right<nums.length;right++){
      if(nums[right]==0){
        zerCount++;
      }
      while(zerCount>k){
        if(nums[left]==0){
          zerCount--;
        }
        left++;
      }
      maxLength = Math.max(maxLength,right-left+1);
    }

    return maxLength;
  }
}
