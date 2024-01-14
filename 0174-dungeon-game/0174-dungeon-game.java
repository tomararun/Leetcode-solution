class Solution {
    public int calculateMinimumHP(int[][] D) {
        int n = D.length - 1, m = D[0].length - 1;
        for(int i = n - 1; i > -1; i--)
            if(D[i + 1][m] < 0)
                D[i][m] += D[i + 1][m];
        for(int j = m - 1; j > -1; j--)
            if(D[n][j + 1] < 0)
                D[n][j] += D[n][j + 1];
        for(int i = n - 1; i > -1; i--){
            for(int j = m - 1; j > -1; j--){
                if(D[i + 1][j] < 0 && D[i][j + 1] < 0)
                    D[i][j] += Math.max(D[i+1][j], D[i][j+1]);
            }
        }
        return 1 + Math.max(0, -D[0][0]);
    }
}