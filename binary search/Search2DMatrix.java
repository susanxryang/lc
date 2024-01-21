import java.util.*;

class Search2DMatrix {
    public static void main(String[] args){
        // int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int[][] matrix = {{1},{3}};
        
        System.out.print(searchMatrix(matrix, 3) + " hey");
    }   

    public static boolean searchMatrix(int[][] matrix, int target) {  
      if(matrix.length == 0 || matrix[0].length == 0){
        return false;
      }
      int top = 0;
      int bottom = matrix.length-1;
      int right = matrix[0].length-1;
      while (top + 1 < bottom){
        int row = (bottom - top)/2 + top;
        if(matrix[row][right] < target){
          top = row;
        } else{
          bottom = row;
        } 
      }
      if(matrix[bottom][0] <= target){
        top = bottom;
      }

      // top is the row that the target is in
      int left = 0;
      // int right = matrix[0].length-1;
      while (left + 1 < right){
        int col = (right - left)/2 + left;
        if(matrix[top][col] >= target){
          right = col;
        } else if(matrix[top][col] < target){
          left = col;
        } 
      }
      if(matrix[top][left] == target || matrix[top][right] == target){
        return true;
      }

      return false;
    }
}