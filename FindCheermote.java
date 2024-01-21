import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FindCheermote {
  public static void main(String[] args) {
    int min = 1;
    String[] valid_cheermotes = {"cheer", "party", "pogchamp"};
    String messages = "cheer1 cheer10 pogchamp1 wow!, cheer5 cheer10 this is amazing, party50 party50 lets have a party!";
    // System.out.println(solution(min, valid_cheermotes, messages));
    solution(min, valid_cheermotes, messages);
  }
  
  public static String[] solution(int min_cheermote_amount, String[] valid_cheermotes, String messages) {
    // Please write your code here.
    // HashSet<String> cheermote_set = new HashSet<>();
    // for (int i = 0; i < valid_cheermotes.length; i++){
    //   cheermote_set.add(valid_cheermotes[i]);
    // }
    HashMap<String, Integer> cheermote_count = new HashMap<>();

    String makePattern = "";
    for (int i = 0; i < valid_cheermotes.length; i++){
      makePattern += valid_cheermotes[i] + "\\d+|";
    }
    makePattern = makePattern.substring(0, makePattern.length() - 1);

    Matcher matcher = Pattern.compile(makePattern).matcher(messages);

    while(matcher.find()){
      String found = messages.substring(matcher.start(), matcher.end()+1);
      int count = Integer.valueOf(found.replaceAll("[^0-9]", ""));
      // System.out.println(count);

      String cheermote = found.replaceAll("[0-9]", "");

      // System.out.println(cheermote);
      if(count >= min_cheermote_amount){
        if(cheermote_count.keySet().contains(cheermote)){
          cheermote_count.put(cheermote, cheermote_count.get(cheermote)+count);
        } else{
          cheermote_count.put(cheermote, count);
        }
      }
      
    }

    // search each string for cheermote 
    // if string contains match for letters234, then see if its a cheermote, and meets min requirement
    // if so, add to existing cheermote count
    String[] result = new String[cheermote_count.keySet().size()];
    int i = 0;
    for (String this_cheermote : cheermote_count.keySet()){
      result[i] = this_cheermote + cheermote_count.get(this_cheermote);
      i++;
    }
    for (String one : result){
      System.out.println(one);
    }

    return result;
  }
}


// class Cheer {
//   // protected String[] valids = {"cheer", "party", "pogchamp"};
//   protected String cheermote;
//   protected int count;
  
//   public Cheer(String cheer, int count) {
//     cheermote = cheer;
//     count = count;
//   }
  
//   public int size(){
//     return count;
//   }
// }
