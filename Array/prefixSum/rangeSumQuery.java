import java.io.*;

public class rangeSumQuery {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        // Number of elements
        int n = Integer.parseInt(br.readLine());

        // Array elements
        String[] input = br.readLine().split(" ");

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Create NumArray object
        NumArray obj = new NumArray(nums);

        // Number of queries
        int q = Integer.parseInt(br.readLine());

        // Process queries
        for (int i = 0; i < q; i++) {

            String[] query = br.readLine().split(" ");

            int left = Integer.parseInt(query[0]);
            int right = Integer.parseInt(query[1]);

            System.out.println(obj.sumRange(left, right));
        }
    }
}

class NumArray {

    int[] prefix;

    public NumArray(int[] nums) {

        prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }
}