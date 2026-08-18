import java.util.Arrays;

public class BoatsToSavePeople {
  public static void main(String[] args) {
    int[] people = {3,2,2,1};
    int limit = 3;
    System.out.println(numRescueBoats(people,limit));
  }
  public static int numRescueBoats(int[] people,int limit){

    Arrays.sort(people);

    int boats = 0;
    int left = 0;
    int right = people.length - 1;

    while(left <= right){
      if(people[left] + people[right] <= limit){
        boats ++;
        left++;
        right--;
      } 
      else {
        boats ++;
        right--;
      }
    } 
    return boats;
  }
}
