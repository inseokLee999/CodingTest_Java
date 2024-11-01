package day1101;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 타임머신11657 {
    static int N, M;

    static class Edge {
        int start;
        int end;
        int time;

        public Edge(int start, int end, int time) {
            this.start = start;
            this.end = end;
            this.time = time;
        }
    }

    static long[] distance;
    static ArrayList<Edge> A;

    /**
     * 벨만 포드를 사용해서
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        distance = new long[N + 1];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[1] = 0;
        A = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            A.add(new Edge(s, e, t));
        }
        if (!bellmanFord()) {
            bw.write("-1\n");
        } else {
            for (int i = 2; i <= N; i++) {
                if (distance[i] == Long.MAX_VALUE) {
                    bw.write("-1\n");
                } else {
                    bw.write(distance[i] + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean bellmanFord() {
        for (int i = 0; i < N - 1; i++) {
            for (Edge e : A) {
                if (distance[e.start] < Long.MAX_VALUE && distance[e.end] > distance[e.start] + e.time) {
                    distance[e.end] = distance[e.start] + e.time;
                }
            }
        }
        for (Edge e : A) {
            if (distance[e.start] < Long.MAX_VALUE && distance[e.end] > distance[e.start] + e.time) {
                return false;
            }
        }
        return true;
    }
}
