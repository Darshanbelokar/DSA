public class two_sum_optimal{
  public static void main (String[] args){
    int[] arr1 = {1,2,3,4,5};
    int target = 5;

    int[] ans = twosum(arr1, target);
    System.out.println(ans[0] + " " + ans[1]);

  }

  public static int[] twosum(int[] arr,int target){ 
      int n = arr.length;
      int left = 0;
      int right = n-1;

      while(left<right){
        int sum = arr[left] + arr[right];
        if(sum == target){
          return new int[] {left+1,right+1};
        }
        else if(sum>target){
          right--;
        }
        else{
          left++;
        }
      }

    return new int[0];
  }
}