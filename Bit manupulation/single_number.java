public class single_number {
  public static void main(String[] args) {
    int[] n = {2,4,6,2,4,6,1,1,5,5};
    System.out.println(single(n));
  }

  public static int single(int[] nums){
    int res=0;

    for(int num:nums){
      res=res^num;
    }

    return res;
  }
}
