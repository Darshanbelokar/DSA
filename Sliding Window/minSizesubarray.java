public class minSizesubarray{
  public static void main(String[] args){
    int[] nums5 = {2,3,1,2,4,3};
    int target = 7;
    System.out.println(minsubarray(target, nums5));
  }
  public static int minsubarray(int target,int[] nums){
    int minLength = Integer.MAX_VALUE;

    int left = 0 ;
    int right= 0;
    int sum = 0;
    
    for(right = 0;right<nums.length;right++){

      sum += nums[right]; 

      while(sum >= target){
        int currentLength = right - left + 1;
        minLength = Math.min(minLength,currentLength);

        sum -= nums[left];
        left ++; 
      }
      
  }
  return minLength;

  }

}