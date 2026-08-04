package Sorting;

public class Contains_duplicate {
    public static void main(String[] args) {
        int [] arr={23,3,1,4,1};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums){

        for(int i=0;i<nums.length-1;i++){
            boolean swapped=false;
            for(int j=0 ;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==nums[j+1]){
                    return true;
                }
            }
        }

        return false;
    }
}
