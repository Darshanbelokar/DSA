import java.util.HashMap;
import java.util.Map;

public class continuousSubarraySum {
  public static void main(String[] args) {
    int [] nums = {23,2,6,4,7};
    int k = 6;
    System.out.println(checkSubarraySum(nums, k));
  }

  public static boolean checkSubarraySum(int[] nums ,int k){
    int n = nums.length;

    Map<Integer,Integer> map = new HashMap<>();
    map.put(0,-1);

    int sum = 0;

    for(int i = 0;i < n;i++){
      sum += nums[i];

      int remainder = sum % k;

      if(map.containsKey(remainder)){
        if(i - map.get(remainder) >= 2){
          return true;
        }
        
      }
      else{
        map.put(remainder,i);
      }
     }
     return false;
  }
}

