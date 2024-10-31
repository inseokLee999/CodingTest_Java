package day1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 토마토7576 {
    static int N;
    static int M;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};
    static int[][] tomato;
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dimension = br.readLine().split(" ");
        M = Integer.parseInt(dimension[0]);
        N = Integer.parseInt(dimension[1]);
        tomato = new int[N][M];
        int countOne = 0;
        for(int i=0;i<N;i++){
            String line = br.readLine();
            String[] str = line.split(" ");
            for(int j=0;j<M;j++){
                tomato[i][j] = Integer.parseInt(str[j]);
                if(tomato[i][j]==1)
                    queue.offer(new int[]{i,j});
            }
        }

        //저장 될 때 부터 모든 토마토가 익어있는 상태 (0인 상태 x)
        //bfs 실행 1인곳에서 모두 실행 후 최대 숫자?
        System.out.println(bfs());

        //bfs 종료 후

        //0이 있으면 -1
    }

    private static int bfs() {
        int days = -1;
        while(!queue.isEmpty()){
            int size = queue.size();
            days++;

            for(int i=0;i<size;i++){
                int[] arr = queue.poll();
                int x = arr[0];
                int y = arr[1];

                for(int j=0;j<4;j++){
                    int curX = x + dx[j];
                    int curY = y + dy[j];
                    if(curX>=0&&curX<N&&curY>=0&&curY<M && tomato[curX][curY]==0){
                        tomato[curX][curY]=1;
                        queue.offer(new int[]{curX,curY});
                    }
                }
            }

        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(tomato[i][j]==0){
                    return -1;
                }
            }
        }
        return days;
    }

    private static boolean checkTomato() {
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(tomato[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
}
