package day1031;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 연구소14502 {
    /*
     * 3중 포문 돌면서 벽 3개 쳤을때 체크
     *
     * bfs() 해서 0 개수 세서 최대
     * */
    static int N;
    static int M;
    static int[][] lab;
    static int answer = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        lab = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < M; j++) {
                lab[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        buildWalls(0);
        System.out.println(answer);
    }

    private static void buildWalls(int count) {
        if (count == 3) {
            spreadVirus();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (lab[i][j] == 0) {
                    lab[i][j] = 1;
                    buildWalls(count + 1);
                    lab[i][j] = 0;
                }
            }
        }
    }

    private static void spreadVirus() {
        int[][] tempLab = new int[N][M];
        for (int i = 0; i < N; i++) {
            System.arraycopy(lab[i], 0, tempLab[i], 0, M);
        }
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tempLab[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int x = pos[0];
            int y = pos[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if(tempLab[nx][ny] == 0){
                        tempLab[nx][ny] = 2;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        calcSafeArea(tempLab);
    }

    private static void calcSafeArea(int[][] tempLab) {
        int safeArea = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tempLab[i][j] == 0) {
                    safeArea++;
                }
            }
        }
        answer = Math.max(answer,safeArea);
    }
}
