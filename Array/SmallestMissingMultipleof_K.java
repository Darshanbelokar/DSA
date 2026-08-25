import java.util.HashSet;
import java.util.Set;

public class SmallestMissingMultipleof_K {
  public static void main(String[] args) {
    int [] number ={8,2,3,4,6};
    System.out.println(missingMultiple(number, 2));
  }

  public static int missingMultiple(int [] nums,int k){
    Set<Integer> set = new HashSet<>();

    for(int n : nums){
      set.add(n);
    }

    int missingNum = k;
  
    while(set.contains(missingNum)){
      missingNum += k;
    }
    return missingNum;

  }
}
