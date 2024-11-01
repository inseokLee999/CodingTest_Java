package day1031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS와BFS1260 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }
        DFS(V);
        Arrays.fill(visited,false);
        System.out.println();
        BFS(V);
    }

    private static void DFS(int n) {
        visited[n] = true;
        System.out.print(n+" ");
        for(int i = 0;i<A[n].size();i++){
            if(!visited[A[n].get(i)]){
                DFS(A[n].get(i));
            }
        }

    }

    private static void BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visited[n] = true;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            System.out.print(cur+" ");
            for(int i = 0;i<A[cur].size();i++){
                if(!visited[A[cur].get(i)]){
                    visited[A[cur].get(i)] = true;
                    queue.offer(A[cur].get(i));
                }
            }
        }
    }


}
