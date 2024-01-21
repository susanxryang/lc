import java.util.*;

class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        // inputs are sorted as assumed
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // output is not considered in space
        List<Integer> list = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (i < nums2.length && j < nums1.length) {
            // both skip duplicates
            while (i > 0 && i < nums2.length && nums2[i] == nums2[i - 1])
            i++;
            while (j > 0 && j < nums1.length && nums1[j] == nums1[j - 1])
            j++;

            // when still valid
            if (i < nums2.length && j < nums1.length) {
                int n = nums2[i];
                int m = nums1[j];
                if (m == n) {
                    list.add(n);
                    i++;
                    j++;
                } else if (m > n)
                    i++;
                else
                    j++;
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}