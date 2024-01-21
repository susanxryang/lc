import java.util.*;

class PlusOne {
    public static void main (String[] args){
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        for(int i = 0; i < result.length; i++){
          System.out.print(result[i]);
        }
        
    }   

    public static int[] plusOne(int[] digits) {  
      int n = digits.length - 1;
      if(digits[n] != 9){
        digits[n] ++;
        return digits;
      }else{
        for(int i = n; i >= 0; i--){
          if(digits[i] != 9){
            digits[i] ++;
            return digits;
          }else{
            digits[i] = 0;
          }
        }
        int[] newArr = new int[n+2];
        newArr[0] = 1;
        for(int i = 1; i < n + 1; i++){
          newArr[i] = 0;
        }
        return newArr;
      }

    }
}