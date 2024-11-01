package day1101;

import java.util.*;

public class 숨바꼭질313549 {
    static boolean[] visited;
    static int MAX = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int N = Integer.parseInt(str[0]);
        visited = new boolean[MAX + 1];
        int K = Integer.parseInt(str[1]);

        //bfs
        System.out.println(bfs(N, K));
    }

    private static int bfs(int n, int k) {
        Deque<int[]> deque = new LinkedList<>();
        deque.add(new int[]{n, 0});
        visited[n] = true;
        while (!deque.isEmpty()) {
            int[] cur = deque.poll();
            int pos = cur[0];
            int time = cur[1];

            if (pos == k) return time;
            if (pos * 2 <= MAX && !visited[pos * 2]) {
                visited[pos * 2] = true;
                deque.addFirst(new int[]{pos * 2, time});
            }
            if (pos - 1 >= 0 && !visited[pos - 1]) {
                visited[pos - 1] = true;
                deque.addLast(new int[]{pos - 1, time + 1});
            }
            if (pos + 1 <= MAX && !visited[pos + 1]) {
                visited[pos + 1] = true;
                deque.addLast(new int[]{pos + 1, time + 1});
            }
        }
        return -1;
    }
}
