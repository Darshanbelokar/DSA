public class Second_largest {
    public static void main(String[] args) {
        int[] array={1,1,2};
        int result = second_largest(array);
        if (result == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element: " + result);
        }
    }
    public static int second_largest(int[] array){
        if(array.length<2){
            return Integer.MIN_VALUE;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            }
            else if(array[i]>secondLargest && array[i]!=largest){
                secondLargest=array[i];
            }
        }
        return secondLargest;
    }
}
