import java.util.Arrays;

public class Remove_duplicates {
    public static void main(String[] args) {
        int [] array={1,1,2,2,3,3,4};

        remove_duplicates(array);

    }
    public static void remove_duplicates(int[] array){
        int j=1;

        for(int i=1;i<array.length;i++){
           if(array[i]!=array[i-1]){
               array[j]=array[i];
               j++;
           }
        }

        System.out.println("Number of unique elements:"+j);
        for(int i=0;i<j;i++){
            System.out.println(array[i]);
        }
    }
}
