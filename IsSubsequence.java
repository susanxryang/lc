public class IsSubsequence{
  public static void main(String[] args){
    String s = "axc";
    String t = "ahbgdcuu";
    System.out.println(isSubsequence(s,t));
  }
  public static boolean isSubsequence(String s, String t){
    char[] s_arr = s.toCharArray();
    char[] t_arr = t.toCharArray();
    if(s_arr.length == 0){
      return true;
    }

    int i = 0;
    int k = 0;
    while(k < t_arr.length){
      if(i == s_arr.length){
        return true;
      }
      if(s_arr[i] == t_arr[k]){
        i++;
        k++;
      }else{
        k++;
      }
    }
    if(i == s_arr.length){
      return true;
    }else{
      return false;
    }
    // return false;
  }
}