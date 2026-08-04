import java.util.HashMap;
import java.util.Stack;
public class nextGreaterElementIOptimal {
  public static void main(String[] args) {
    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};

    int[] ans = nextGreaterElement(nums1, nums2);

    for (int x : ans) {
        System.out.print(x + " ");
    }
  }

  public static int[] nextGreaterElement(int[] nums1,int[] nums2){
    Stack<Integer> stack = new Stack<Integer>();
    HashMap<Integer,Integer> map = new HashMap<>();

    int n= nums2.length;

    for(int i = n-1;i >= 0;i--){
      while(!stack.isEmpty() &&  stack.peek() <= nums2[i] ){
        stack.pop();
      }
      if(stack.isEmpty()){
        map.put(nums2[i],-1);
      }
      else{
        map.put(nums2[i],stack.peek());
      }

      stack.push(nums2[i]);
    }
    int[] ans = new int[nums1.length];

    for(int i = 0 ;i < nums1.length;i++){
      ans[i] = map.get(nums1[i]);
    }
    return ans;
  }
}
