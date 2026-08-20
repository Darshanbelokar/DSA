public class MintinCoco {
  public static void main(String[] args) {
    
    System.out.println(minTins(5)); 
    System.out.println(minTins(62));
  }

  public static int minTins(int demand){
    int answer = 0; 
    int remaining = demand;

    if(demand < 0){
      return 0;
    }

    while(remaining > 0){

      if(remaining >= 10){
        remaining -= 10;
      }

      else if(remaining >= 7){
        remaining -= 7;
      }

      else if(remaining >= 5){
        remaining -= 5;
      }

      else if(remaining >= 3){
        remaining -= 3;
      }
      
      else{
        remaining -= 1;
      }
    answer ++;

  }
  return answer;
}
}