import java.util.*;
class ReformatTheString {
    public static void main(String[] args){
        String s = "covid2019";
        System.out.print(romanToInt(s));
    }   
    public static String romanToInt(String s) {
        Stack ints = new Stack<Integer>();
        Stack chars = new Stack<String>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr >= 'a' && curr <= 'z'){
                chars.push(curr);
            } else{
                ints.push(curr);
            }
        }
        if(Math.abs(chars.size() - ints.size()) > 1){
            return "";
        }

        String r = "";
        Stack l;
        Stack st;
        if(chars.size() > ints.size()) {
            l = chars;
            st = ints;
        } else{
            l = ints;
            st = chars;
        }
        
        while(!st.empty()){
            r += l.pop();
            r += st.pop();
        }
        if(!l.empty()){
            r += l.pop();
        }

        return r;
    }
}