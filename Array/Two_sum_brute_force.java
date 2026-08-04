public class Two_sum_brute_force{
  public static void main(String[] args) {
    int[] nums = {2,3,5,7};
    int target = 11;

    int[] result = two_sum(nums, target);

    System.out.print(result[0]+" "+result[1]);
  }

  public static int[] two_sum(int[] nums,int target){
    for(int i=0; i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
          return new int[] {i,j};
        }
      }
    }
    return new int[] {-1,-1};
  }
}