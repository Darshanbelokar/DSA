import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class subarraySumEqualsK_Optimal {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter no.of Elements :");
    int n = Integer.parseInt(reader.readLine());

    System.out.println("Enter elements in the array:");
    String[] input = reader.readLine().split(" ");

    int[] arr = new int[n];

    for(int i = 0;i < n ; i++){
      arr[i] = Integer.parseInt(input[i]);
    }

    System.out.println("Enter value of K");
    int k = Integer.parseInt(reader.readLine());

    int  result = subarraySum(arr, k);
    System.out.println(result);
  }

  public static int subarraySum(int [] arr,int k){
      int n = arr.length;
      int count = 0;

      // Prefix Sum array
      int[] prefixSum = new int[n];

      prefixSum[0] = arr[0];

      for (int i = 1; i < n; i++) {
          prefixSum[i] = prefixSum[i - 1] + arr[i];
      }

      // HashMap: prefixSum -> frequency
      HashMap<Integer, Integer> map = new HashMap<>();

      for (int j = 0; j < n; j++) {

          // Case 1: subarray starts from index 0
          if (prefixSum[j] == k) {
              count++;
          }

          // Case 2: subarray starts after index 0
          int val = prefixSum[j] - k;

          if (map.containsKey(val)) {
              count += map.get(val);
          }

          // Store current prefix sum
          map.put(
              prefixSum[j],
              map.getOrDefault(prefixSum[j], 0) + 1
          );
      }

      return count;
  }
}
