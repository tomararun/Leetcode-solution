class Solution {
    public String licenseKeyFormatting(String s, int k) {
        while (s.length() > 0 && s.charAt(0) == '-') s = s.substring(1);
        while (s.length() > 0 && s.charAt(s.length() - 1) == '-') s = s.substring(0, s.length() - 1);
        String[] split = s.toUpperCase().split("-");
        int len = s.length() - (split.length - 1), lenFirst = len % k == 0 ? k : len % k;
        StringBuilder sb = new StringBuilder();
        for (String str : split) sb.append(str);
        String temp = sb.toString();
        if (temp.length() <= k) return temp;
        sb.setLength(0);
        sb.append(temp,0, lenFirst).append("-");
        int i = lenFirst;
        while (i < temp.length()) {
            sb.append(temp, i, i + k).append("-");
            i += k;
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}