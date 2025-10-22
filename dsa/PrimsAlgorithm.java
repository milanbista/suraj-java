package dsa;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class PrimsAlgorithm {

    public static void main(String[] args) {

        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        PriorityQueue<Edge> pq = new PriorityQueue<>((a,b)->a.weight - b.weight);
        pq.add( new Edge(0, 0, 0));
        //int[][] visitedEdges = new int[graph.length][graph[0].length];
        int[] visitedEdges = new int[graph.length];
        visitedEdges[0] = 1;
        int result = 0;

        while(!pq.isEmpty()){
            Edge edge = pq.poll();
//            if(visitedEdges[edge.to] == 1)
//                continue;
//            visitedEdges[edge.to] = 1;
            result += edge.weight;

            System.out.println("now selecting " + edge);
            System.out.println("We are choosing from " + edge.from + " to " + edge.to + " weight " + edge.weight);
            System.out.println("Total result = " + result);

            //get minimum edge
            for( int i = 0; i< graph[edge.to].length; i++){
                if(graph[edge.to][i] != 0 && i != edge.to && visitedEdges[i] == 0  ){
                    pq.offer(new Edge(graph[edge.to][i], edge.to, i));
                    visitedEdges[i] = 1;
                }
            }
            System.out.println("After exploring the size of queue" + pq.size());
        }

        System.out.println("SMT is " + result);


    }

}

class Edge{
    int weight;
    int from;
    int to;

    Edge(int weight, int from, int to){
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
