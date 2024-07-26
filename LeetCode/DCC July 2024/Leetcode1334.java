// Example 1:

// Input: n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4
// Output: 3
// Explanation: The figure above describes the graph. 
// The neighboring cities at a distanceThreshold = 4 for each city are:
// City 0 -> [City 1, City 2] 
// City 1 -> [City 0, City 2, City 3] 
// City 2 -> [City 0, City 1, City 3] 
// City 3 -> [City 1, City 2] 
// Cities 0 and 3 have 2 neighboring cities at a distanceThreshold = 4, but we have to return city 3 since it has the greatest number.

public class Leetcode1334 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // Floyd Warshall algorithm
        int[][] distance = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(distance[i], 1000000000); // consider max integer as a infinite.
            distance[i][i] = 0;
        }

        for(int[] edge : edges){
            distance[edge[0]][edge[1]] = edge[2];
            distance[edge[1]][edge[0]] = edge[2];
        }

        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    distance[i][j] = Math.min(distance[i][j], distance[i][k]+distance[j][k]);
                }
            }
        }
        int ans = -1;
        int mini = Integer.MAX_VALUE;
        int[] reachable = new int[n];
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(i != j && distance[i][j] <= distanceThreshold){
                    count++;
                }
            }
            reachable[i] = count;
            if(count <= mini){
                mini = count;
                ans = i;
            }
        }
        return ans;
    }
}
