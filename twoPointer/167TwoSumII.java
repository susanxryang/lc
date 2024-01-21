import java.util.*;

class TwoSumII {
  public static void main(String[] args) {
    int[] numbers = { 3, 24, 50, 79, 88, 150, 345, 200 };
    int[] result = twoSum(numbers, 200);
    // int[] numbers = {2,7,11,15};
    // int[] result = twoSum(numbers, 9);
    System.out.print(result[0] + "," + result[1] + " hello world");
  }

  // public static int[] twoSum(int[] numbers, int target) {
  // int index1 = 0;
  // int index2 = 0;
  // for(int i = 0; i < numbers.length - 1; i++){
  // int curr = numbers[i];
  // int diff = target - curr;

  // int front = i+1;
  // int back = numbers.length - 1;
  // while (front + 1 < back){
  // int mid = (back - front)/2 + front;
  // if(numbers[mid] < diff){
  // front = mid;
  // } else if(numbers[mid] > diff){
  // back = mid;
  // } else{
  // index1 = i + 1;
  // index2 = mid + 1;
  // break;
  // }
  // }
  // if (numbers[front] == diff) {
  // index1 = i + 1;
  // index2 = front + 1;
  // break;
  // } else if (numbers[back] == diff) {
  // index1 = i + 1;
  // index2 = back + 1;
  // break;
  // }
  // }
  // int[] result = {index1, index2};
  // return result;
  // }

  public static int[] twoSum(int[] numbers, int target) {
    int front = 0;
    int back = numbers.length - 1;
    while (front < back) {
      int sum = numbers[front] + numbers[back];
      if (sum > target) {
        back--;
      } else if (sum < target) {
        front++;
      } else {
        return new int[] { front + 1, back + 1 };
      }
    }
    return new int[] { front + 1, back + 1 };
  }
}