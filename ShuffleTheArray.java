public class ShuffleTheArray{
  public static void main(String[] args){
    int[] nums = {2,5,1,3,4,7};
    int n = 3;
    System.out.println(shuffle(nums, n));
  }

  public static int[] shuffle(int[] nums, int n) {
    int[] newArr = new int[2*n];
    for(int i = 0; i < n; i++){
      newArr[2*i] = nums[i];
      newArr[2*i+1] = nums[n+i];
    }
    return newArr;
  }
}