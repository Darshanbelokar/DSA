import java.util.Arrays;

public class Reverse_an_array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println("Reversed array: "+ Arrays.toString(reverse(array)));
    }
    public static int[]reverse(int[] array){

        int i=0;
        int j=array.length-1;
        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return array;
    }
}
