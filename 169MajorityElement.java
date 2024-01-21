import java.util.*;

class MajorityElement {
  public static void main(String[] args) {
    int[] nums = {3,2,3};
    
    System.out.print(majorityElement(nums));
  }

  public static int majorityElement(int[] nums) {
    HashMap<Integer, Integer> count = new HashMap<>();
    for(int i : nums){
      if(!count.keySet().contains(i)){
        count.put(i, 0);
      }
      count.put(i, count.get(i)+1);
    }

    int half = nums.length/2;
    int output = 0;
    for(int j : count.keySet()){
      if(count.get(j) > half){
        output = j;
      }
    }
    return output;
  }
}