public class Search_in_rotatedd_sorted {
  public static void main(String[] args) {
    
  }

  public static int search(int[] nums,int target){
    int left = 0;
    int right = nums.length - 1;

    while(left <= right){
      int mid = left + (right-left) / 2;

      if(nums[mid] == target){
        return mid;
      }
      if(nums[mid] >= nums[left]){ //left sorted array
        if(nums[left] <= target && target < nums[mid]){
          right = mid-1;
        }
        else{
          left = mid + 1;
        }
      }
      else { //Right Sorted array
        if(nums[mid] < target && target <= nums[right]){
          left = mid + 1;
        }
        else{
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}
