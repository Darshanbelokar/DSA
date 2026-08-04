import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagram {
  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};

    System.out.println(groupanagram(strs));
    
  }

  public static List<List<String>> groupanagram(String[] strs){
    HashMap<String,List<String>> map = new HashMap<>();

    for(String str : strs){

      char[] chars = str.toCharArray();
      Arrays.sort(chars);

      String key = new String(chars);

      if(!map.containsKey(key)){
        map.put(key,new ArrayList<>());
      }
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }
} 
