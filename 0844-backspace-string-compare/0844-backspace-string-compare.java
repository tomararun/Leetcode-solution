class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i= 0;
        
        while (i < s.length())
        {
            if (s.charAt(i) == '#')
            {
                if (i != 0)
                {
                    s = s.substring(0,i-1) + s.substring(i+1);
                    i--;
                }
                else
                {
                    s = s.substring(i+1);
                    i=0;
                }
            }
            else 
                i++;
        }
        i=0;
        while (i < t.length())
        {
            if (t.charAt(i) == '#')
            {
                if (i != 0)
                {
                    t = t.substring(0,i-1) + t.substring(i+1);
                    i--;
                }
                else
                {
                    t = t.substring(i+1);
                    i=0;
                }
            }
            else
                i++;
        }
        
        return s.equals(t);
    }
}