import java.util.HashMap;

public class two_sum_optimal {
  public static void main(String[] args) {
    int[] nums={10,34,2,2};
    int target = 4;

    int[] result = two_Sum(nums, target);

    System.out.println(result[0]+ " "+ result[1]); 
  }

  public static int[] two_Sum(int[] nums,int target){

    HashMap<Integer,Integer> prevMap = new HashMap<>();

    for(int i=0;i<nums.length;i++){
      int num = nums[i];
      int diff = target - num;

      if(prevMap.containsKey(diff)){
        return new int[] {prevMap.get(diff),i};
       }

       prevMap.put(num,i);
    }

    return new int[] {-1,-1};
  }
}
