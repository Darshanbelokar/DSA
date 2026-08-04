import java.util.Arrays;

public class move_zero_end_brute_force {
  public static void main(String[] args){
     int[] nums = {0,1,0,3,12};

        moveZero(nums);

        System.out.println(Arrays.toString(nums));
  }

  public static void moveZero(int[] arr){

    int[] temp = new int[arr.length];

    int j = 0;

    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        temp[j]=arr[i];
        j++;
      }
    }

    for(int i=0;i<arr.length;i++){
      arr[i]=temp[i];
    }
  }
}
