public class square_root {
  public static void main(String[] args) {
    int x = 25;
    System.out.println(squareRoot(x));
  }

  public static int squareRoot(int x){
    if(x < 2) return x;

    int left = 1;
    int right = x/2;

    while(left <= right){
      int mid = left + (right-left) / 2;
      long square = mid * mid;

      if(square == x){
        return (int) mid;
      }

      if(square < x){
        left = mid+1;
      }
      else{
        right = mid-1;
      }
    }
    return right;
  }
}