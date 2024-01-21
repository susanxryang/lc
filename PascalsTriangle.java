import java.util.*;

class PascalsTriangle {
  public static void main(String[] args) {
    generate(5);
    // for(int i = 0; i < nums1.length; i++){
    // System.out.print(nums1[i]);
    // }
  }

  public static List<List<Integer>> generate(int numRows) {
    if (numRows == 0) {
      return new ArrayList<List<Integer>>();
    }
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    result.add(new ArrayList<Integer>(Arrays.asList(1)));

    for (int i = 1; i < numRows; i++) { // place into rows
      List<Integer> prevRow = result.get(i - 1);
      List<Integer> newRow = new ArrayList<Integer>();
      newRow.add(1);
      for (int j = 1; j < i; j++) {
        int above_left = prevRow.get(j - 1); 
        int above_right = prevRow.get(j);
        newRow.add(above_left + above_right);
      }
      newRow.add(1);
      result.add(newRow);

    }

    for (int i = 0; i < result.size(); i++) {
      for (int num : result.get(i)) {
        System.out.print(num);
      }
      System.out.println();
    }
    return result;
  }
}