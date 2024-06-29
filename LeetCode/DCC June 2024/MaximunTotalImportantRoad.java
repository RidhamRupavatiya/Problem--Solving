import java.util.*;

// You are given an integer n denoting the number of cities in a country. The cities are numbered from 0 to n - 1.

// You are also given a 2D integer array roads where roads[i] = [ai, bi] denotes that there exists a bidirectional road connecting cities ai and bi.

// You need to assign each city with an integer value from 1 to n, where each value can only be used once. The importance of a road is then defined as the sum of the values of the two cities it connects.

// Return the maximum total importance of all roads possible after assigning the values optimally.

class MaximunTotalImportantRoad {
    public static long maximumImportance(int n, int[][] roads) {
        // Array to sotre the degree of each city
        int[] degree = new int[n];

        // Calculate the degree of each city
        // for(int[] road : roads){
        //     degree[road[0]]++;
        //     degree[road[1]]++;
        // }
        
        for(int i=0; i<roads.length; i++){
            for(int j=0; j<roads[0].length; j++){
                degree[roads[i][j]]++;
            }
        }

        // Create a list of cities and sort by degree
        // Integer[] cities = new Integer[n];
        // for(int i = 0; i < n; i++){
        //     cities[i] = i;
        // }
        // Arrays.sort(cities, new Comparator<Integer>(){
        //     public int compare(Integer a, Integer b){
        //         return Integer.compare(degree[b], degree[a]);
        //     }
        // });
        // // Assign values to cities starting from the highest degree
        // long ans = 0;
        // for(int i = 0; i < n; i++){
        //     ans += (long) (n - i) * degree[cities[i]];
        // }
        Arrays.sort(degree);
        int ans = 0, value=1;
        for(int i=0; i<degree.length; i++){
            ans += degree[i] * value;
            value++;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int edges[][] = {
            {0,1},
            {1,2},
            {2,3},
            {0,2},
            {1,3},
            {2,4}
        };
        long ans = maximumImportance(n, edges);
        System.out.println("maximum importanca roads :- "+ans);
    }
}