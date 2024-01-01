class Solution {
    public boolean judgeCircle(String moves) {
        int point[] = {0,0};
        int move[][] = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (Character m: moves.toCharArray()) {
            int ind = 0;
            switch (m)
            {
                case 'U': {
                    ind = 0;
                    break;
                }
                case 'D': {
                    ind = 1;
                    break;
                }
                case 'L': {
                    ind = 2;
                    break;
                }
                case 'R': {
                    ind = 3;
                    break;
                }
            }
            point[0] += move[ind][0];
            point[1] += move[ind][1];
        }
        return point[0] == 0 && point[1] == 0;
    }
}