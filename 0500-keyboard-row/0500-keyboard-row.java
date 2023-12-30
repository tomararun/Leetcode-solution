class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        loop:
        for(String word : words) {
            char[] chars = word.toLowerCase().toCharArray();

            boolean canBeTyped = true;
            for(char c : chars) {
                int idx = firstRow.indexOf(c);
                if(idx == -1) {
                    canBeTyped = false;
                    break;
                }
            }
            if(canBeTyped) {
                res.add(word);
                continue loop;
            }

            canBeTyped = true;
            for(char c : chars) {
                int idx = secondRow.indexOf(c);
                if(idx == -1) {
                    canBeTyped = false;
                    break;
                }
            }
            if(canBeTyped) {
                res.add(word);
                continue loop;
            }

            canBeTyped = true;
            for(char c : chars) {
                int idx = thirdRow.indexOf(c);
                if(idx == -1) {
                    canBeTyped = false;
                    break;
                }
            }
            if(canBeTyped) {
                res.add(word);
                continue loop;
            }
        }
        
        String[] ans = new String[res.size()];
        int i = 0;
        for(String word : res) {
            ans[i++] = word;
        }

        return ans;
    }
}