import java.util.*;
public class three_sum_optimal {
  public static void main(String[] args){
     int[] nums = {-1,0,1,2,-1,-4};
     System.out.println(threesum(nums));
  }

  public static List<List<Integer>> threesum(int[] nums){
    List<List<Integer>> res = new ArrayList<>();

    int n = nums.length;

    Arrays.sort(nums);

    for(int i=0;i<n-2;i++){
      if(i>0 && nums[i]==nums[i-1]) continue;

      int l=i+1,r=n-1;

      while(l<r){
        int sum = nums[i] + nums[l] + nums[r];

        if (sum == 0) {
          res.add(Arrays.asList(nums[i], nums[l], nums[r]));

          l++;
          r--;

          while (l < r && nums[l] == nums[l - 1]) {
              l++;
          }

          while (l < r && nums[r] == nums[r + 1]) {
              r--;
          }
        }
        else if(sum>0){
          r--;
        }
        else{
          l++;
        }
      }
    }
    return res;
  }
}
