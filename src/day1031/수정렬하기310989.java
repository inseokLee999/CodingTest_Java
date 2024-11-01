package day1031;

import java.io.*;
import java.util.Arrays;

public class 수정렬하기310989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(A);
        for(int a: A){
            bw.write(a+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
