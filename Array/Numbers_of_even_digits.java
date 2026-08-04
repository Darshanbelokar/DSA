public class Numbers_of_even_digits {
    public static void main(String[] args) {
        int [] nums={23,1,4,34,42};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int n=0;
        if (num == 0) {
            n = 1;
        }
        while(num>0){
            n++;
            num=num/10;
        }
        return n % 2 == 0;
    }
}
