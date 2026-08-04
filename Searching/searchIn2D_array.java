package Searching;

import java.util.Arrays;

public class searchIn2D_array {
    public static void main(String[] args) {
        int[][] arr={
                {23,1,43},
                {47,45,13},
                {76,5,4,2}
        };
        int target=43;

        int[]ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(arr[row][column]==target){
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
