// public class pivot_index {
//     public static void main(String[] args) {
//       int nums[] = {1,7,3,6,5,6};
//       System.out.println(pivotIndex(nums));
//    }

//     public static int pivotIndex(int[] nums){

//       for(int i = 0 ;i < nums.length;i++){
//         int leftSum = 0;

//         for(int j = 0 ;j < i;j++){
//           leftSum += nums[j];
//         }

//         int rightSum=0;
//         for(int k = i + 1;k<nums.length;k++){
//           rightSum += nums[k];
//         }

//         if(leftSum == rightSum){
//           return i;
//         }
//       }
//       return ;
//     }
public class pivot_index{
  public static void main(String[] args) {
    
  }

  public static int pivotindex(int nums[]){
    int totalSum = 0;
    for(int num : nums){
      totalSum  += num;
    }

    int leftSum = 0;
    for(int i = 0;i<nums.length;i++){
      int rightSum = totalSum - leftSum;

      if(leftSum == rightSum){
        return i;
      }
    }
    return -1;
  }
}