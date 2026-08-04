import java.util.HashMap;

public class subarray_sum_eqals_k {

  public static void main(String[] args) {
    int[] arr1 = {1,1,1};
    int k = 2;
    System.out.println(subarraySum(arr1, k));
  }

  public static int subarraySum(int[] nums,int k){
    HashMap<Integer,Integer> map = new HashMap<>();

    map.put(0,1);

    int count = 0;
    int prefixSum = 0;

    for(int n : nums){
      prefixSum += n;

      if(map.containsKey(prefixSum-k)){
        count += map.get(prefixSum-k);
      }

      map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
    }
    return count;
  }
}
