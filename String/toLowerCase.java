public class toLowerCase {
  public static void main(String[] args) {
    String a = "Hello";
    System.out.println(toLowerCase(a));
  }

  public static String toLowerCase(String s){
    StringBuilder ans = new StringBuilder();

    for(char ch : s.toCharArray()){
      if(ch >= 'A' && ch <= 'Z'){
        ch = (char)(ch + 32);
      }
      ans.append(ch);
    }
    return ans.toString();
  }
}
