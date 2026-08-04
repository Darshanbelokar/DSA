package Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] arr={23,2,45,3,25};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection_sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;

            while(j>-1 && temp<arr[j]){
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        Arrays.sort(arr);
    }
}
