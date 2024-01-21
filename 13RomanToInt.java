import java.util.*;
class RomanToInt {
    public static void main(String[] args){
        System.out.print(romanToInt("IV"));
    }   
    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        char[] roman = new char[] {'I','V','X','L','C','D','M'};
        int[] val = new int[] {1,5,10,50,100,500,1000};
        for (int i = 0; i < 7; i++){
            m.put(roman[i], val[i]);
        }
        int result = 0;
        for (int i = 0; i < s.length()-1; i++){
            char key = s.charAt(i);
            char next_key = s.charAt(i+1);
            int this_num = m.get(key);
            int next_num = m.get(next_key);
            if( this_num < next_num ){
                this_num = -this_num;
            }
            result += this_num;
        }
        char key = s.charAt(s.length()-1);
        result += m.get(key);
        return result;    
    }
}