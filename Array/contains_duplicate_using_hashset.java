import java.util.HashSet;

public class contains_duplicate_using_hashset {
  public static void main(String[] args) {
    
    int[] nums = {10,11,12,10};
    System.out.println(dup(nums));
  }

  public static boolean dup(int [] nums){
    HashSet<Integer> set = new HashSet<>();

    for(int num : nums){
      if(set.contains(num)){
        return true;
      }
      set.add(num);
    }
    return false;
  }
}
