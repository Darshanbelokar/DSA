package Binary_search;

public class binary_search {
  public static void main(String[] args) {
    
  }

  public static int search(int[] nums,int target){
    return binarysearch(nums,0, nums.length-1, target);
  }

  public static int binarysearch(int[] nums ,int left,int right, int target){
    if(left > right){
      return -1;
    }

    int mid = left + (right-left) / 2;

    if(nums[mid] == target){
      return mid;
    }

    if(nums[mid] < target){
      return binarysearch(nums,mid+1,right,target);x
    }

    else
      return binarysearch(nums, left, mid-1, target);
  }
}
