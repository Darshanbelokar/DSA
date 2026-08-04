public class NextGreaterElementI_Brute {
  public static void main(String[] args) {
    int [] nums1 = {4,1,2};
    int[] nums2 = {1,3,4,2};

    int[] ans = nextGreaterElement(nums1, nums2);

    for(int num : ans){
      System.out.println(num);
    }
  }

  public static int[] nextGreaterElement(int[] nums1,int[] nums2){
    int[] result = new int[nums1.length];

    for(int i=0;i<nums1.length;i++){
      result[i] =-1;
      int j;
      for(j=0;j<nums2.length;j++){
        if(nums2[j] == nums1[i]){
            break;
        }
      }

      for(j = j+1;j<nums2.length;j++){
        if(nums2[j]>nums1[i]){
          result[i] = nums2[j];
          break;
        }
      }
    }

    return result;
  }
}
