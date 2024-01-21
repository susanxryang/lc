
public class CanPlaceFlowers{
  public static void main(String[] args){
    int[] flowerbed = {1,0,0,0,1};
    int n = 1;
    System.out.println(canPlaceFlowers(flowerbed, n));
  }

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 0;
    if(flowerbed.length == 1){
      if(flowerbed[0] == 0){
        return n <= 1;
      }else{
        return n == 0;
      }
    }
    if(flowerbed[0] == 0 && flowerbed[1] == 0){ // place in the first one
      flowerbed[0] = 1;
      count++;
    }
    for(int i = 1; i < flowerbed.length - 1; i++){
      if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
        flowerbed[i] = 1;
        count++;
      }
      if(count >= n){
        return true;
      }
    }

    if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
      flowerbed[flowerbed.length - 1] = 1;
      count++;
    }

    return count >= n;
  }
}