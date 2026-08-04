public class search_insert_position {
  public static void main(String[] args) {
    int[] nums = {1,2,4,5,6,7};

    System.out.println(searchInsertPosition(nums, 3));
  }

  public static int searchInsertPosition(int[] nums,int target){
    int left = 0;
    int right = nums.length - 1;

    while(left <= right){
      int mid = left + (right-left) / 2;

      if(nums[mid] == target){
        return mid;
      }
      else if(nums[mid] > target){
        right = mid - 1;
      }
      else{
        left = mid + 1;
      }
    }
    return left;
  }
}
