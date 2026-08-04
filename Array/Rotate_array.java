

public class Rotate_array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int k=3;
       rotate(array,k);
       for(int num:array){
           System.out.println(num+" ");
       }
    }
    public static void rotate(int[] nums, int k){

        int[] temp=new int[nums.length];
        int indeex=0;
        for(int i=k;i<nums.length;i++){
            temp[indeex++]=nums[i];
        }
        for(int i=0;i<k;i++){
            temp[indeex++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}

