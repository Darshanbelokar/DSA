import java.util.HashSet;
import java.util.Set;

public class longest_substring_brute_force {
    public static void main(String[] args) {
        String s = "abcdd";
        System.out.println(longest_substring(s));
    }

public static int longest_substring(String str) {
   int result = 0;

   for(int i = 0;i<str.length();i++){
    Set<Character> set = new HashSet<>();
      for(int j = i;j<str.length();j++){
        if(set.contains(str.charAt(j))){
          break;
        }
        set.add(str.charAt(j));
      }

      result = Math.max(result,set.size());
   }
   return result;
}
}