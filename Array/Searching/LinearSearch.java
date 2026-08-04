package Searching;

public class LinearSearch {

    static int linearsearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int target = 30;

        int result = linearsearch(a, target);

        if (result != -1) {
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
