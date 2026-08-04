import java.util.*;

public class three_sum_brute_force {

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};

        System.out.println(threesum(arr));
    }

    public static List<List<Integer>> threesum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < arr.length - 2; i++) {

            for(int j = i + 1; j < arr.length - 1; j++) {

                for(int k = j + 1; k < arr.length; k++) {

                    if(arr[i] + arr[j] + arr[k] == 0) {

                        List<Integer> triplet =
                                Arrays.asList(arr[i], arr[j], arr[k]);

                        Collections.sort(triplet);

                        set.add(triplet);
                    }
                }
            }
        }

        ans.addAll(set);

        return ans;
    }
}