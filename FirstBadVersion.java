import java.util.*;

class FirstBadVersion {
    public static void main(String[] args){
        int n = 5;
        System.out.print(firstBadVersion(n) + " hey");
    }   

    public static int firstBadVersion(int n) {  
      int front = 0;
      int back = n;
      while(front + 1 < back){
        int mid = (back - front)/2 + front;
        if(isBadVersion(mid)){
          back = mid;
        } else{
          front = mid;
        }
      }
      return back;
    }

    public static boolean isBadVersion(int n){
      if(n >= 4) return true;
      else return false;
    }
}