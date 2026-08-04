public class contain_duplicate{
  public static void main(String[] args) {
      int[] nums = {0,1,3,2,4,0};

      System.out.println(duplicate(nums));
  }

  public static boolean duplicate(int[] nums){

    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[i] == nums[j]){
          return true;
        }
      }
    }

    return false;
  }
}