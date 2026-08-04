public class fruits_into_basket_brute_force {
  public static void main(String[] args) {
    int[]fruits = {4,2,5};
    int[]baskets = {3,5,4};

    System.out.println(numUnplacedFruits(fruits, baskets));
  } 
  
  public static int numUnplacedFruits(int[] fruits,int[] baskets){

   int unplacedFruits = 0;
   boolean [] used = new boolean[baskets.length];

   for(int i=0;i<fruits.length;i++){
    boolean placed = false;
    for(int j=0;j<baskets.length;j++){
      if(!used[j] && baskets[j] >= fruits[i]){
        used[j] = true;
        placed = true;
        break;
      }
    }
      if(!placed){
        unplacedFruits++;
      }
   }

    return unplacedFruits;
  }
}
