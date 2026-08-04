import java.util.Arrays;

public class two_sum_in_sorted {
  public static void main(String[] args) {
    int[] nums = {1,2,4,6};
    int target = 5;

    System.out.println(Arrays.toString(twosum(nums, target)));
  }

  public static int[] twosum(int[] nums,int target){
    int left  = 0;
    int right  = nums.length-1;

    while(left<right){
      int curSum = nums[left] + nums[right];
        if(curSum > target){
          right--;
        }
        else if(curSum<target){
          left++;
        }
        else{
          return new int[] {left+1,right+1};
        }
    }
    return new int[0];
  }
}
