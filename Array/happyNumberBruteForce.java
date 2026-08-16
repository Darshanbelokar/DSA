import java.util.HashSet;
import java.util.Set;

public class happyNumberBruteForce {
  public static void main(String[] args) {
    int m = 2;
    System.out.println(isHappy(m));
  }

  public static boolean isHappy(int n){
    Set<Integer> set1 = new HashSet<>();
  
    while(n != 1){
      if(set1.contains(n)){
        return false;
      }
      set1.add(n);
      int sum = 0;
      while(n > 0){
        int digit = n % 10;
        sum +=digit * digit;
        n = n / 10;
      }
      n = sum;
  }
    return true;
  }
}
