package day1017;

import java.io.IOException;
import java.util.*;

public class dfs와bfs {
    /**
     *
     */
    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            A[start].add(end);
            A[end].add(start);
        }
        for (int i = 1; i < N; i++) {
            Collections.sort(A[i]);
        }
        visited = new boolean[N + 1];
        DFS(V);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(V);
    }

    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(Node);
        visited[Node] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");
            for (int i : A[cur]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void DFS(int Node) {
        System.out.print(Node + " ");
        visited[Node] = true;
        for (int i : A[Node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
