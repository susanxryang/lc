import java.util.*;

class MajorityElementII {
  public static void main(String[] args) {
    int[] nums = {3,2,3};
    
    System.out.print(majorityElement(nums));
  }

  public static List<Integer> majorityElement(int[] nums) {
    HashMap<Integer, Integer> count = new HashMap<>();
    for(int i : nums){
      if(!count.keySet().contains(i)){
        count.put(i, 0);
      }
      count.put(i, count.get(i)+1);
    }

    int third = nums.length/3;
    List<Integer> output = new ArrayList<Integer>();
    for(int j : count.keySet()){
      if(count.get(j) > third){
        output.add(j);
      }
    }
    return output;
  }
}