import java.util.Arrays;

public class Move_zeros_to_end {
    public static void main(String[] args) {
        int[] array={1,2,0,2,0,4,2,0};

        move_zeros(array);
    }
    public static void move_zeros(int[] array){
        int i=0;

        for(int j=0;j<array.length;j++){
            if(array[j]!=0){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
            }
        } 
        System.out.println(Arrays.toString(array));;
    }
}
