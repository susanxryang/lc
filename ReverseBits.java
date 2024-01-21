import java.util.ArrayList;
import java.util.List;

public class ReverseBits{
    public static void main(String[] args) {
        // you need treat n as an unsigned value       
        System.out.print(reverseBitsManipulation(10011));
    }

    public static int reverseBitsManipulation(int n){
        List<Integer> l = new ArrayList<Integer>();
        int result = 0;
        int times = 32;
        int newX = n;
        while (times > 0) {
            result <<=1;
            int insert = newX & 1;
            newX>>>=1;
            times--;
            result+=insert;
        }
        
        return result;
    }
} 