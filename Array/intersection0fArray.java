import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersection0fArray {
  public static void main(String[] args) {
    int [] nums3 = {1,2,2,1};
    int [] nums4 = {2,2};

    int [] result = intersection(nums3, nums4);

    for(int num : result){
      System.out.println(num +  " ");
    }
  }

  public static int[] intersection(int[] nums1 ,int[] nums2){

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> result= new HashSet<>();

    for(int num : nums1){
      set1.add(num);
    }

    for(int num : nums2){
      if(set1.contains(num)){
        result.add(num);
      }
    }
    

    int [] ans = new int[result.size()];

    int i = 0;
    for(int num : result){
      ans[i] = num;
      i++;
    }
    return ans;
  }
}
