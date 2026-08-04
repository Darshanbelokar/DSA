import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
  public static void main(String[] args) {
    int[] nums = {1,2,1};
    int[] ans = nextGreaterElementII(nums);
   for(int x : ans){
    System.out.println(x);
   }
  }

  public static int [] nextGreaterElementII(int[] nums){
    int n = nums.length;
    int [] ans = new int [n];
    Arrays.fill(ans, -1);

    Stack<Integer> stack = new Stack<>();

    for(int i=2*n-1;i>=0;i--){
      int num = nums[i%n];
      while(!stack.isEmpty() && stack.peek() <= num){
        stack.pop();
      }
      if(i<n && !stack.isEmpty() ){
        ans[i] = stack.peek();
      }

      stack.push(num);

    }
    return ans;
  }
}
