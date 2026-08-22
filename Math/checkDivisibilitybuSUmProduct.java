public  class checkDivisibilitybuSUmProduct{
  public static void main(String[] args) {
    int m = 99;
    System.out.println(checkDivisibility(m));
  }

  public static boolean checkDivisibility(int n){
    String nums = Integer.toString(n);

    int sum = 0;
    int product = 1;

    for(char num : nums.toCharArray()){
      int digit = num - '0';
      sum += num;

      product *= num;
    }
    
    return sum+product == n;
  }
}