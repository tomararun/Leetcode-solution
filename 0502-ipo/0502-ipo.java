class Solution {
    public int findMaximizedCapital(int k, int w, int[] pf, int[] cp) {
        
        int n = pf.length;
        int arr[][] = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i] = new int[]{pf[i],cp[i]};
        }

        Arrays.sort(arr,(a,b)->(a[1]-b[1]));

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int i=0;

        while(k>0){
            while(i<n && w>=arr[i][1]){
                pq.add(arr[i][0]);
                i++;
            }
            if(pq.size()!=0){
                w = w+pq.remove();
            }
            k--;
        }
        return w;
    }
}