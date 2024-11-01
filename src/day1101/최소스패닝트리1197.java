package day1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 최소스패닝트리1197 {
    static int V, E;

    static class Edge implements Comparable<Edge> {
        int start;
        int end;
        long weight;

        public Edge(int s, int e, int w) {
            this.start = s;
            this.end = e;
            this.weight = w;
        }

        @Override
        public int compareTo(Edge o) {
            return Long.compare(this.weight, o.weight);
        }
    }

    static ArrayList<Edge> A;
    static ArrayList<Edge> selected;
    static int[] unionFind;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        A = new ArrayList<>();
        selected = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            A.add(new Edge(s, e, w));
        }
        A.sort(null);
        unionFind = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            unionFind[i] = i;
        }
        for (Edge e : A) {
            int start = e.start;
            int end = e.end;
            long weight = e.weight;
            if(find(start)!=find(end)){
                union(start,end);
                selected.add(e);
            }
        }
        long answer = 0;
        for(Edge e:selected){
            answer+=e.weight;
        }
        System.out.println(answer);
    }

    static int find(int i) {
        if (unionFind[i] == i) {
            return i;
        } else {
            return unionFind[i] = find(unionFind[i]);
        }
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            unionFind[rootB] = rootA;
        }
    }
}
