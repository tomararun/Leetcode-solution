class Solution {
    Map<Integer, List<Integer>> map;
    static Random random = new Random();

    public Solution(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                map.get(key).add(i);
            } else {
                List<Integer> ids = new ArrayList<>();
                ids.add(i);
                map.put(key, ids);
            }
        }
    }

    public int pick(int target) {
        List<Integer> ids = map.get(target);
        return ids.get(random.nextInt(ids.size()));
    }
}