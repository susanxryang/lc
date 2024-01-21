public class MultiplyStrings {
  public static void main(String[] args) {
    String num1 = "9";
    String num2 = "99";
    System.out.println(multiply(num1, num2));
  }

  public static String multiply(String num1, String num2) {
    if(num1.length() == 0 || num2.length() == 0){
      return "0";
    }
    int len1 = num1.length() - 1;
     
    // int degree = 0;
    int[] result = new int [len1 + len2 + 2];

    for (int k = len1; k >= 0; k--){
      // degree = 0;
      for (int l = len2; l >= 0; l--){
        int product = (num1.charAt(k) - '0') * (num2.charAt(l) - '0');
        int posLow = k + l + 1;
        int posHigh = k + l;
        product += result[posLow];
        result[posLow] = product%10;
        result[posHigh] += product/10;
      } 
    }
    StringBuilder sb = new StringBuilder();
    for(int res : result){
      if(!(sb.length() == 0 && res == 0)){
        sb.append(res);
      }
    }

    if(sb.length() == 0){
      return "0";
    }
    return sb.toString();
  }

}