public class two_sum {
  public static void main(String[] args){
    int[] arr = {1,2,3,4};
    int target = 4;

    int[] ans = twosum(arr,target);
    System.out.print(ans[0]+" "+ans[1]);
  }

  public static int[] twosum(int[] arr,int target){

    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==target){
          return new int[] {i,j};
        }
      }
    }

  return new int[0];
  }

}
