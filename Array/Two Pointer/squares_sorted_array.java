import java.util.ArrayList;
import java.util.Arrays;

public class squares_sorted_array {
  public static void main(String[] args) {
    int[] nums = {-4,-1,0,3,10};
    System.out.println(Arrays.toString(sortedSquares(nums)));
  }

  public static int[] sortedSquares(int[] nums){
    int n =nums.length;
    
    int left = 0;
    int right = n-1;
    int index = n-1;

    int[] ans = new int[n];

    while(left <= right){
      int leftSquare = nums[left] * nums[left];
      int rightSquare = nums[right] * nums[right];

      if(leftSquare > rightSquare){
        ans[index] = leftSquare;
        left++;
      }
      else{
        ans[index] = rightSquare;
        right--;
      }
      index--;
    }
    return ans;
  }
}
