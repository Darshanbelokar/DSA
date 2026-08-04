public class search_2d_array {
      public static void main(String[] args) {
        int[][] matrix1 = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        int target1 = 0;

        System.out.println(searchMatrix(matrix1, target1));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}