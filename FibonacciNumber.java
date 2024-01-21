public class FibonacciNumber{
  public static void main(String[] args){
    int n = 3;
    System.out.println(fib(n));
  }

  public static int fib(int n) {
    int sum = 0; 
    if(n == 1){
      return 1;
    }
    int prev1 = 0;
    int prev2 = 1;
    for (int i = 1; i < n; i++){
      sum = prev1 + prev2;
      prev1 = prev2;
      prev2 = sum;
    }
    return sum;
  }
}