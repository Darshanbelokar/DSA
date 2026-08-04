package Searching;


public class search_in_range {
    public static void main(String[] args) {
    int []arr={1,2,3,4,5,6,};
    int target=4;
    int start=0;
    int end=4;
        System.out.println(search_in_range(arr,target,start,end));
    }
    public static int search_in_range(int[] arr,int target,int start,int end){
     if(arr.length==0){
        return -1;
    }
     for(int i=start;i<=end;i++){
        if(arr[i]==target){
            return i;
        }
    }
        return -1;
}
}
