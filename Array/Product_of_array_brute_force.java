import java.util.Arrays;

public class Product_of_array_brute_force {
  public static void main(String[] args) {
    int[] nums = {0};
    System.out.println(Arrays.toString(product(nums)));
  } 

  public static int[] product(int[] nums){

    int[] result = new int[nums.length];
    for(int i=0;i<nums.length;i++){
      int product = 1;
      for(int j=0;j<nums.length;j++){
        if(i!=j){
          product *= nums[j];
        }
      } 
      result[i] = product;
    }

    return result;
  }
}
