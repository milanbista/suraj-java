package dsa;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[][] points = {
                {0, 0},
                {2, 2},
                {3, 10},
                {5, 2},
                {7, 0}
        };

        System.out.println(minCostConnectPoints(points));
    }
    static public int minCostConnectPoints(int[][] points) {

        int[][] mat = new int[points.length][points.length];

        //create weighted matrix
        for(int i = 0; i< points.length; i++){
            for(int j = 0; j<points.length; j++){
                //distance
                int distance = i == j? 0: Math.abs(points[i][0]-points[j][0]) + Math.abs(points[i][1]-points[j][1]);
                mat[i][j] = distance;
                mat[j][i] = distance;
            }
        }

        // Print the matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }



        PriorityQueue<Edges> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        List<Integer> visited = new ArrayList<>();

        int cost = 0;
        pq.add(new Edges(0, 0, 0));
        visited.add(0);

        while(!pq.isEmpty()){
            Edges node =  pq.poll();

            System.out.println("selection min node weight " + node.weight + " from " + node.from + " to " + node.to);
            cost += node.weight;
//            visited.add(node.to);
            System.out.println("total cost " + cost);

            for(int i = 0; i< mat[node.to].length; i++){
                if(!visited.contains(i)){
                    System.out.println("adding " + i);
                    pq.add(new Edges(mat[node.to][i], node.to, i));
                    visited.add(i);
                }
            }
        }

        return cost;
    }

}

class Edges{
    int weight;
    int from;
    int to;

    Edges(int weight, int from, int to){
        this.weight = weight;
        this.from = from;
        this.to = to;
    }
}

