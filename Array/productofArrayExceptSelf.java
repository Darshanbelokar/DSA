class productofArrayExceptSelf{
  public static void main(String[] args) {
    int nums [] = {1,2,3,4};

    int[] answer = product(nums);

    for(int num : answer){
      System.out.println(num + " ");
    }
  }

  public static  int[] product(int[] nums){

    int[] ans = new int[nums.length];

    for(int i = 0;i<nums.length;i++){
      int product = 1;
      for(int j = 0;j<nums.length;j++){
        if(j  != i){
          product *= nums[j];
        }
      }
      ans[i] = product; 
    }

    return ans;  
  }
}