package twoPointer;
import java.util.*;

class ContainerWithMostWater{
  public static void main(String[] args) {
    // int[] height = {1,8,6,2,5,4,8,3,7};
    int[] height = {2,3,10,5,7,8,9};
    System.out.print(maxArea(height));
  }

  public static int maxArea(int[] height) {
    int area = 0;
    int left = 0;
    int right = height.length - 1;
    while(left < right){
      int width = right - left;
      int new_area = width * Math.min(height[right], height[left]);
      area = Math.max(area, new_area);
      
      if (height[left] < height[right])
        left++;
      else
        right--;
    }
    
    return area;
  }

}