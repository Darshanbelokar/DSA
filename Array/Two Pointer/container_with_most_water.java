public class container_with_most_water {

    public static void main(String[] args) {
        int[] nums = {8,3,2,1,6};

        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] nums) {

        int res = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                res = Math.max(
                        res,
                        Math.min(nums[i], nums[j]) * (j - i)
                      ); 
            }
        }

        return res;
    }
}