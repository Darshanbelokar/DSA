import java.util.ArrayList;
import java.util.List;

public class FizzBuzz{
  public static void main(String[] args){
    System.out.println(fizzbuzz(15));
  }

  public static List<String> fizzbuzz(int n){
    List<String> lst = new ArrayList<>(); 

      for(int i = 1; i <= n ;i++){
        if(i%3==0 && i%5==0){
          lst.add("FizzBuzz");
        }  
        else if(i%3 == 0){
          lst.add("Fizz");
        }
        else if(i%5 ==0 ){
          lst.add("Buzz");
        }
        else{
          lst.add(String.valueOf(i));
        }
      }
    return lst;
  }
}