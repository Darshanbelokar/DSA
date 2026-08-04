package Searching;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr={23,34,23,2,543,23,3,};
        int target=543;
        int ans=linearsearch(arr,target);
        System.out.println(ans);
    }
    public static int linearsearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}