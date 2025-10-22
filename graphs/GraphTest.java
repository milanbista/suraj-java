package graphs;

import java.util.*;

public class GraphTest {


    public static void main(String[] args) {

        int[][] edges = {{0,1}, {1,2}, {1,3}, {2,3}, {2,4}};
        Graph g = new Graph(5);
        g.undirectedGraph(edges);
        //g.directedGraph(edges);
        g.printGraph();
        g.printInAndOutDegree();
        g.getPathBreathFirst(0,4);
        g.getPathDepthFirst(3,4);
    }

}

class Graph{
    /// matrix
    /// adj list
    List<List<Integer>> adjList = new ArrayList<>();
    Map<Integer, Integer> indegree = new HashMap<>();
    Map<Integer, Integer> outdegree = new HashMap<>();

    Graph(int v){
        for (int i = 0; i< v; i++){
            adjList.add(new ArrayList<>());
        }
    }

    void undirectedGraph(int[][] edges){
        for (int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
    }

    void directedGraph(int[][] edges){
        for (int[] edge: edges){
            adjList.get(edge[0]).add(edge[1]);
            //u will be out degree and v will be in degree
            outdegree.put(edge[0], outdegree.getOrDefault(edge[0], 0) + 1);
            indegree.put(edge[1], indegree.getOrDefault(edge[1], 0) + 1);
        }
    }

    void printGraph(){
        for (int i = 0; i< adjList.size(); i++){
            System.out.print(i + " -> " );
            for (int n: adjList.get(i)){
                System.out.print(" " + n);
            }
            System.out.println();
        }

    }

    void printInAndOutDegree(){
        for (int key = 0; key< adjList.size(); key++){
            System.out.println(" for " + key + " -> indegree " + indegree.get(key) + " -> outdegree " + outdegree.get(key));
        }
    }


    void getPathBreathFirst(int start, int end){

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new LinkedHashSet<>();
        Map<Integer, Integer> parents = new HashMap<>();
        queue.add(start);
        visited.add(start);


        while (!queue.isEmpty()){
            int n = queue.poll();
            if(n == end){
                System.out.println("Path found at n " + n);
                while (n != start){
                    System.out.print(" " + n);
                    n = parents.get(n);
                }
                return;
            }
            //check neighbors
            for(int neighbors: adjList.get(n)){
                if(!visited.contains(neighbors)) {
                    parents.put(neighbors, n);
                    queue.add(neighbors);
                    visited.add(n);

                }
            }
        }
        System.out.println("No Path found");
    }


    void getPathDepthFirst(int start, int end){

        System.out.println("Depth first search");

        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> parents = new HashMap<>();

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()){
            int n = stack.pop();

            if (n == end){
                //path found
                List<Integer> path = new ArrayList<>();

                while (n != start){
                    path.add(n);
                    n = parents.get(n);
                }
                path.add(n);
                Collections.reverse(path);

                for (int p: path){
                    System.out.println(" " + p);
                }

                return;
            }

            for (int neighbors: adjList.get(n)){
                if(!visited.contains(neighbors)){
                    visited.add(neighbors);
                    stack.push(neighbors);
                    parents.put(neighbors, n);

                }
            }
        }

        System.out.println("No path found");
    }

}

