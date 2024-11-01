package day1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최단경로1753 {
    static int V, E;
    static int[] distance;
    static boolean[] visited;
    static ArrayList<Node>[] edge;

    static class Node implements Comparable<Node>{
        int edge;
        int weight;

        public Node(int edge, int weight) {
            this.edge = edge;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return o.weight-this.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        edge = new ArrayList[V + 1];
        distance = new int[V + 1];
        visited = new boolean[V + 1];
        visited[0] = true;
        Arrays.fill(distance, Integer.MAX_VALUE);
        for (int i = 1; i <= V; i++) {
            edge[i] = new ArrayList<Node>();
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edge[u].add(new Node(v, w));
        }
        calcDistance(start);
        for(int i =1;i<=V;i++){
            System.out.println(distance[i]==Integer.MAX_VALUE ? "INF":distance[i]);
        }
    }

    private static void calcDistance(int start) {
        distance[start] = 0;
        for (int i = 0; i < V; i++) {
            int curIndex = findMin();
            visited[curIndex] = true;
            if(edge[curIndex]==null){
                continue;
            }
            for (Node n : edge[curIndex]) {
                int edge = n.edge;
                int weight = n.weight;
                distance[edge] = Math.min(distance[edge],distance[curIndex]+weight);
            }
        }
    }

    private static int findMin() {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 1; i <= V; i++) {
            if (!visited[i] && min > distance[i]) {
                min = distance[i];
                index = i;
            }
        }
        return index;
    }
}
