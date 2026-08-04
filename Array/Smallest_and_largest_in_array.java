public class Smallest_and_largest_in_array {
    public static void main(String[] args) {
        int array[]={0,1,342,3,4,5};
        System.out.println("Smallest element: "+smallest(array));
        System.out.println("Largest element: "+largest(array));
    }
    public static int smallest(int[] array){
        int smallest=array[0];
        for(int i=0;i<array.length;i++){
            if (array[i] < smallest){
                smallest=array[i];
             }
        }
        return  smallest;
    }
    public static int largest(int [] array){
        int largest=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        return largest;
    }
}

