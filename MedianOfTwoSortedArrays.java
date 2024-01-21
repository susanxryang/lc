import java.util.*;

class MedianOfTwoSortedArrays {
    public static void main (String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        // output: [1,2,2,3,5,6]
        // int[] res = merge(nums1, nums2);
        // for(int num : res){
        //   System.out.print(num);
        // }
        System.out.print(findMedianSortedArrays(nums1, nums2));
    }   

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {  
      int m = nums1.length;
      int n = nums2.length;
      int[] res = new int[m+n];
      int i = 0, j = 0, k = 0;
      while(i < m && j < n){
        if(nums1[i] < nums2[j]){
          res[k] = nums1[i];
          k++;
          i++;
        }else{
          res[k] = nums2[j];
          k++;
          j++;
        }
      }
      if(i < m){
        for(int p = i; p < m; p++){
          res[k] = nums1[p];
          k++;
        }
      }else if(j < n){
        for(int p = j; p < n; p++){
          res[k] = nums2[p];
          k++;
        }
      }

      if(res.length%2 == 0){ // even
        return (res[(res.length-1)/2] + res[res.length/2])/2.0;
      }else{
        return res[res.length/2];
      }

    }
}