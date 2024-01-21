public class AddStrings {
  public static void main(String[] args) {
    String num1 = "18582506933032752";
    String num2 = "366213329703";
    System.out.println(addStrings(num1, num2));
  }

  public static String addStrings(String num1, String num2) {
    long result = 0;
    int carry = 0;
    int length1 = num1.length() - 1;
    int length2 = num2.length() - 1;
    int place = 0;
    while (length1 >= 0 && length2 >= 0) {
      int val1 = Character.getNumericValue(num1.charAt(length1));
      int val2 = Character.getNumericValue(num2.charAt(length2));
      int sum = (val1 + val2 + carry);
      result += Math.pow(10, place) * (sum % 10);
      if (sum > 9) {
        carry = 1;
      } else {
        carry = 0;
      }
      length1--;
      length2--;
      place++;
    }
    if (length1 >= 0) {
      while (length1 >= 0) {
        int val = Character.getNumericValue(num1.charAt(length1));
        result += Math.pow(10, place) * (val + carry);
        carry = 0;
        length1--;
        place++;
      }
    } else if (length2 >= 0) {
      while (length2 >= 0) {
        result += Math.pow(10, place) * (Character.getNumericValue(num2.charAt(length2)) + carry);
        carry = 0;
        length2--;
        place++;
      }
    }
    if (carry != 0) {
      result += Math.pow(10, place) * 1;
    }
    return Long.toString(result);
  }

  // public String addStrings(String num1, String num2) {
  //   int i = num1.length() - 1;
  //   int j = num2.length() - 1;
  //   int carry = 0;
  //   char[] num1Array = num1.toCharArray();
  //   char[] num2Array = num2.toCharArray();
  //   StringBuilder sb = new StringBuilder();
  //   while (i >= 0 || j >= 0 || carry == 1) {
  //     int a = i >= 0 ? (num1Array[i--] - '0') : 0;
  //     int b = j >= 0 ? (num2Array[j--] - '0') : 0;
  //     int sum = a + b + carry;
  //     sb.insert(0, sum % 10);
  //     carry = sum / 10;
  //   }
  //   return sb.toString();
  // }
}