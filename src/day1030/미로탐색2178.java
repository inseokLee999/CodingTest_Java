package day1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 미로탐색2178 {
    static int N,M;
    static int[][] maze;
    static int[][] distance;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dimension = br.readLine().split(" ");
        N = Integer.parseInt(dimension[0]);
        M = Integer.parseInt(dimension[1]);
        maze = new int[N][M];
        distance = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
                distance[i][j] = -1;
            }
        }
        System.out.println(bfs(0,0));
    }

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        distance[x][y] = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curx = cur[0];
            int cury = cur[1];

            if(curx == N-1 && cury == M-1){
                return distance[curx][cury];
            }
            for(int i=0;i<4;i++){
                int nx = curx + dx[i];
                int ny = cury + dy[i];
                if(nx>=0 && nx<N && ny>=0 && ny<M && maze[nx][ny]==1 && distance[nx][ny]==-1){
                    distance[nx][ny] = distance[curx][cury] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return -1;
    }
}
