import java.util.HashSet;
import java.util.Set;

public class firstUniqueCharacter {
  public static void main(String[] args) {
    
  }

  public static int firstUniqueCharacter(String s){
    
    int [] freq = new int[26];

    for(char ch : s.toCharArray()){
      freq[ch - 'a']++;
    }

    for(int i = 0;i < s.length();i++){
      if(freq[s.charAt(i) - 'a'] == 1){
        return i;
      }
    }
    return -1;
  }
}
