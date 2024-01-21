import java.util.*;

class MergeSortedArray {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2 };
    int[] nums2 = { 3, 4 };
    // output: [1,2,2,3,5,6]
    int[] res = merge(nums1, nums2);
    for (int num : res) {
      System.out.print(num);
    }
    // System.out.print(merge(nums1, nums2));
  }

  public static double merge(int[] nums1, int[] nums2) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    while (k >= 0 && j >= 0) {
      nums1[k--] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
    }

  }
}