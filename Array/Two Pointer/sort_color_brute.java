import java.util.Arrays;

public class sort_color_brute {
  public static void main(String[] args) {
    int[] arr1={1,0,1,2,2,0};

    int[] ans = sortcolor(arr1);
    System.out.println(Arrays.toString(ans));
  }

  public static int[] sortcolor(int[] nums){
    int countzero = 0;
    int countone = 0;
    int counttwo=0;

    for(int i=0;i<nums.length;i++){
      if(nums[i] == 0){
        countzero++;
      }
      else if(nums[i] == 1){
        countone++;
      }
      else{
        counttwo++;
      }
    }

    int i=0;
    while(countzero>0){
      nums[i] = 0;
      i++;
      countzero--;
    }

      while(countone>0){
      nums[i] = 1;
      i++;
      countone--;
    }

      while(counttwo>0){
      nums[i] = 2;
      i++;
      counttwo--;
    }

    return nums;
  }
}
