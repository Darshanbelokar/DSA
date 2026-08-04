import java.util.Arrays;

public class product_array_suffix_prefix{
  public static void main(String[] args) {
    int[] nums = {10,2,4};
    System.out.println(Arrays.toString(product(nums)));
  }

  public static int[] product(int[] nums){
    int n = nums.length;
    int[] result = new int[n];

    result[0] = 1;

    for(int i = 1;i<n;i++){
      result[i] = result[i-1] * nums[i-1]; 
    }

    int postfix = 1;

    for(int i=n-1;i>=0;i--){
      result[i] *= postfix;
      postfix *= nums[i];
    }

    return result;
  }

}