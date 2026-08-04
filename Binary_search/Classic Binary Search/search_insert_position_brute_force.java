public class search_insert_position_brute_force {
  public static void main(String[] args) {
    int[] nums = {1,2,4,5,6,7};
    System.out.println(searchInsert(nums, 3));
  }

  public static int searchInsert(int[] nums,int target){
    for(int i=0;i<nums.length;i++){
      if(nums[i] >= target){
        return i;
      }
    }
    return nums.length;
  }
}
