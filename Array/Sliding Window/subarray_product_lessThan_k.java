public class subarray_product_lessThan_k {
  public static void main(String[] args) {
    int[] arr1 = {3,2,7,4,8};
    int k = 1000;

    System.out.println(subarrayProductLessThanK(arr1, k));
  }

  public static int subarrayProductLessThanK(int[] nums,int k){

    if(k<=1) return 0;

    int left = 0;
    int count = 0;
    int product = 1;
    int n = nums.length;
    
    for(int right=0;right<n;right++){
      product *= nums[right];
      
      while(product >= k){
        product /=nums[left];
        left++;
      }

      count += right - left + 1;
    }

    return count;
    }
}
