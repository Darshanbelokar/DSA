import java.util.Arrays;

public class valid_Anagram{
  public static void main(String[] args){
    String s = "abcd";
    String t ="dcba";

    System.out.println(anagram(s, t));

  } 
  
  public static boolean anagram(String s, String t){

    if(s.length()!=t.length()){
      return false;
    }

    char[] sSort = s.toCharArray();
    char[] tSort = t.toCharArray();

    Arrays.sort(sSort);
    Arrays.sort(tSort);

    return Arrays.equals(sSort,tSort);
  
  }

}