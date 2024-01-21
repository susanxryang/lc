public class isMatch10 {
    public boolean isMatch(String s, String p) {
        // if character, then matching status same as previous character
        // if . then match status is same as previous character
        // if * then
        //

        if (s == null || p == null) {
            return false;
        }

        int m = s.length();
        int n = p.length();

        boolean[][] M = new boolean[m + 1][n + 1];

        M[0][0] = true;

        for (int j = 2; j < n + 1; j += 2) {
            if (p.charAt(j - 1) == '*' && M[0][j - 2]) { // if pattern is #*#*#*#*#*#*
                M[0][j] = true;
            }
        }

        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n + 1; j++){
                char curS = s.charAt(i - 1);
                char curP = p.charAt(j - 1);
                if(curS == curP || curP == '.'){
                    M[i][j] = M[i - 1][j - 1];
                }else if(curP == '*'){
                    char preCurP = p.charAt(j - 2);
                    if(preCurP != '.' && preCurP != curS){
                        M[i][j] = M[i][j - 2];
                    }else{
                        M[i][j] = (M[i][j - 2] || M[i - 1][j - 2] || M[i - 1][j]);
                    }
                }
            }
        }
        
        return M[m][n];

    }
}
