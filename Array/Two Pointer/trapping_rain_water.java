public class trapping_rain_water {
  public static void main(String[] args) {
    int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};

    System.out.println(trap(heights));
  }

  public static int trap(int[] height){
    int water = 0;

    int left = 0;
    int right = height.length-1;

    int leftmax = height[0];
    int rightmax = height[height.length-1];

    while(left<right){
      if(leftmax<rightmax){
        left++;
        if(leftmax < height[left]){
          leftmax = height[left];
        }
        else{
          water += leftmax-height[left];
        }
      }

      else{
        right--;
        if(rightmax < height[right]){
          rightmax = height[right];
        }
        else{
          water  += rightmax-height[right];
        }
      }
    }

    return water;
  }
}
