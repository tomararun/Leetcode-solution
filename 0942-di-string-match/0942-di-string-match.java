class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        char [] ch = s.toCharArray();

        int ans[] = new int [n+1];

        int x = 0;
        int y = n;
        for(int i = 0;i<ch.length;i++) {
            if(ch[i] == 'I') {
                ans[i] = x++;
            }
            else{
                ans[i] = y--;
            }
        }

        if(ch[ch.length-1] == 'I') {
            ans[n] = x;
        }
        else{
            ans[n] = y;
        }
        return ans;
    }
}