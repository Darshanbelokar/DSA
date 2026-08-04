public class Sorted_or_not {
    public static void main(String[] args) {
        int [] array={7,1,4,5,6};
        System.out.println("Sorted or not: "+check_sorted__not(array));
    }
    public static boolean check_sorted__not(int [] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                  return false;
            }

        }
        return true;
    }
}
