package Searching;

public class Binary_search {
  public static int binarysearch(int[] arr,int target){
    int left=0;
    int right=arr.length;

    while(left<right){
      int mid=(left+right)/2;

      if(target==arr[mid]){
        return mid;
      }
      else if(target<mid){
        mid=mid+1;
      }
      else{
        mid=mid-1;
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    int a[]={10,20,30,40,50,60,70};
    int target=10;

    int result=binarysearch(a, target);

    if(result!=-1){
      System.out.println("Element found at index : "+ result);
    }
    else{
      System.out.println("Element not found");
    }
  }
}
