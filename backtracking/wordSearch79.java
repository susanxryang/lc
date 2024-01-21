class wordSearch79 {
    static boolean[][] visited;
    private int dir[][] = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }};
    private boolean found = false;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if((word.charAt(0) == board[i][j]) && search(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, int i, int j, String word, int curr) {
        if (curr == word.length()) {
            return true;
        }
        if (i >= board.length || i < 0 || j < 0 || j >= board[0].length || board[i][j] != word.charAt(curr) || visited[i][j])
            return false;
        visited[i][j] = true;

        if (search(board, i - 1, j, word, curr + 1) ||
                search(board, i + 1, j, word, curr + 1) ||
                search(board, i, j - 1, word, curr + 1) ||
                search(board, i, j + 1, word, curr + 1)) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }

    public boolean exist2(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(search2(board, i, j, word, 0, Character.toString(board[i][j]))){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean search2(char[][] board, int i, int j, String word, int curr, String currWord) {
        if (currWord.equals(word)) { // if we are at the last index and currentWord == word
            found = true;
            return true;
        }
        if (curr == word.length() && !currWord.equals(word)) { // if we are at the last index and currentWord == word
            return false;
        }
        if (i >= board.length || i < 0 || j < 0 || j >= board[0].length || board[i][j] != word.charAt(curr)) // if we are at the last index and currentWord != word
            return false;
        visited[i][j] = true;
        for (int l = curr; l < word.length(); l++){
            for (int k = 0; k < 4; k++){
                int nextX = dir[k][0] + i;
                int nextY = dir[k][1] + j;
                if(!visited[nextX][nextY]) {
                    currWord = currWord + board[nextX][nextY];
                    search2(board, nextX, nextY, word, l+1, currWord);
                    currWord = currWord.substring(0, currWord.length() - 1);
                }
            }
        }
        visited[i][j] = false;

        return found;
    }
}