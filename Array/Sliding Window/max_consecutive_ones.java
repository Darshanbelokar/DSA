public class max_consecutive_ones {
  public static void main(String[] args) {
    int[] arr = {0,1,1,0,1,0};
    System.out.println(maxconsecutiveones(arr));
  }

  public static int maxconsecutiveones(int[] nums){
    int max_count = 0;
    int current_count = 0;
    int n = nums.length;

    for(int j=0;j<nums.length;j++){
      if(nums[j]==1){
        current_count++;
      }
      else {
        max_count=Math.max(max_count,current_count);
        current_count = 0;
      }
    }

    return max_count;
  }
}
