package sharma.gfg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int V =5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(V);
        for (int i =0; i<V; i++) {
            graph.add(new ArrayList<Integer>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        printGraph(graph);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i =0; i<adj.size(); i++){
            for (int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
