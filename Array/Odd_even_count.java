public class Odd_even_count {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        count(array);
    }
    public static void count(int[] array){
        int odd_count=0;
        int even_count=0;

        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                odd_count++;
            }
            else{
                even_count++;
            }
        }
        System.out.println("Odd Count:"+odd_count);
        System.out.println("Even Count:"+even_count);
    }
}
