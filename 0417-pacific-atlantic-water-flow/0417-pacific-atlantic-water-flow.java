class Solution {

    static int n;
    static int m;
    static int arr[][];
    static int dir[][] = {{0,1},{0,-1},{-1,0},{1,0}};

    static int[][] bfs(Queue<int[]> q){

        int visited[][] = new int[n][m];

        while(q.size()!=0){
            int a[] = q.remove();
            int i = a[0];
            int j = a[1];
            visited[i][j] = 1;
            int h = arr[i][j];

            for(int k=0; k<4; k++){
                int newR = i+dir[k][0];
                int newC = j+dir[k][1];

                if(newR<0 || newC<0 || newR>=n || newC>=m || visited[newR][newC]==1) continue;
                if(arr[newR][newC]>=h) q.add(new int[]{newR,newC});
            }
        }

        return visited;
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        arr = heights;
        n = arr.length;
        m = arr[0].length;

        Queue<int[]> q1 = new LinkedList<>();
        Queue<int[]> q2 = new LinkedList<>();

        for(int i=0; i<n; i++){
            q1.add(new int[]{i,0});
            q2.add(new int[]{i,m-1});
        }
        for(int j=1; j<m; j++){
            q1.add(new int[]{0,j});
        }
        for(int j=0; j<m-1; j++){
            q2.add(new int[]{n-1,j});
        }

        int visited1[][] = bfs(q1);
        int visited2[][] = bfs(q2);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(visited1[i][j]==1 && visited2[i][j]==1){
                    List<Integer> ar = List.of(i,j);
                    ans.add(ar);
                }
            }
        }

        return ans;

    }
}