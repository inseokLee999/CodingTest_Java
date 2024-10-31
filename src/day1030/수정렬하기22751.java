package day1030;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class 수정렬하기22751 {
    static int N;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        for(int i =0;i<N;i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);
        for(int num : numbers){
            bw.write(num+"\n");
        }
        bw.flush();
        bw.close();
    }
}
