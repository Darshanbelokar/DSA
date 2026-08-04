public class Remove_Element {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int val=3;

        int k=remove_Element(nums,val);
        System.out.println("Number of elements after removal:"+k);
        System.out.println("Updated array:");
        for(int i=0;i<k;i++){
            System.out.println(nums[i]+" ");
        }
    }
    public static int remove_Element(int[] nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }
}
