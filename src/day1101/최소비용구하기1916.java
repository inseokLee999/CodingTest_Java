package day1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최소비용구하기1916 {
    /*
     * 1. N,M 입력 받기
     * 2. ArrayList<Node> 초기화 및 값 받기
     * 3. 다익스트라 알고리즘
     * 4. 출력 도착점
     * */
    static int N, M;
    static ArrayList<Node>[] city;
    static int[] distance;

    static class Node implements Comparable<Node>{
        int vertex;
        int weight;

        public Node(int v, int w) {
            this.vertex = v;
            this.weight = w;
        }
        @Override
        public int compareTo(Node o){
            return this.weight-o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        /*
         * 1. N,M 입력 받기
         * 2. ArrayList<Node> 초기화 및 값 받기
         * 3. 다익스트라 알고리즘
         * 4. 출력 도착점
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        //ArrayList<Node> 초기화 및 값 받기
        city = new ArrayList[N+1];
        distance = new int[N+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        for (int i = 1; i <= N; i++) {
            city[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            city[e].add(new Node(v,w));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dijkstra(start,end);

    }

    private static void dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start,0));
        distance[start] = 0;
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            if(cur.weight>distance[cur.vertex]) continue;
            for(Node c : city[cur.vertex]){
                int w = c.weight;
                int v = c.vertex;
                if(distance[v] > distance[cur.vertex]+w){
                    distance[v] = distance[cur.vertex]+w;
                    pq.add(new Node(v,distance[v]));
                }
            }
        }
        System.out.println(distance[end]);
    }
}
