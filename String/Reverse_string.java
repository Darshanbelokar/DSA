import java.util.Arrays;

public class Reverse_string {
  public static void main(String[] args) {
    String str = "hello";

    char[] arr = str.toCharArray();

    reverseString(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void reverseString(char[] s){
    
    int left = 0;
    int right = s.length-1;

    while(left<right){
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;

      left++;
      right--;
    }

  }
}
