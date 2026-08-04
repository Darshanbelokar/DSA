import java.util.HashMap;

public class fruits_into_baskets_904 {
  public static void main(String[] args) {
    int[] fruits = {1,2,3,2,2};
    System.out.println(totalFruits(fruits));
  } 
  
  public static int totalFruits(int[] fruits){
     HashMap<Integer,Integer> map = new HashMap<>();

     int left = 0;
     int ans = 0;

     for(int right=0;right<fruits.length;right++){
      map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

      while(map.size()>2){
        int fruit = fruits[left];

        map.put(fruit,map.get(fruit)-1);

        if(map.get(fruit) == 0){
          map.remove(fruit);
        }
        left++;
      }
      ans = Math.max(ans,right - left + 1);
     }
     return ans;
  }
}
