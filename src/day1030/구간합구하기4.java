package day1030;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 구간합구하기4 {
    /*
     * 1번째 그냥 구간 합? 그러면 N*M안됨
     * 2번째 구간합 구하기 Sum[i,j] = S[i]-S[j]
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[][] answer = new int[M][2];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            answer[i][0] = Integer.parseInt(st.nextToken());
            answer[i][1] = Integer.parseInt(st.nextToken());
        }
        int[] sum = new int[N+1];
        sum[0] = 0;
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + arr[i-1];
        }
        for (int i = 0; i < M; i++) {
            bw.write(sum[answer[i][1]]-sum[answer[i][0]-1]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
