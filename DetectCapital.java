import java.util.HashMap;

public class DetectCapital {
  public static void main(String[] args) {
    String word = "Usa";
    // String s2 = "loveleetcode";
    System.out.println(detectCapitalUse(word));
  }

  public static boolean detectCapitalUse(String word) {
    if(word.length() == 1){
      return true;
    }
   
    if(word.charAt(0) > 96){ // lowercase
      for(int i = 1; i < word.length(); i++){
        if(word.charAt(i) < 96){
          return false;
        }
      }
    }
    if(word.charAt(0) < 96){ // uppercase
      if(word.charAt(1) > 96){ // lowercase
        for(int i = 1; i < word.length(); i++){
          if(word.charAt(i) < 96){
            return false;
          }
        }
      } else{
        for(int i = 1; i < word.length(); i++){
          if(word.charAt(i) > 96){
            return false;
          }
        }
      }
    } 

    return true;
  }

}