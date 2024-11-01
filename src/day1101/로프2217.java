package day1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 로프2217 {
    /*
     * w/k만큼 걸리는 중량
     * 정렬 후에 가장 작은 것 기준으로 W = minWeight * k가 최대
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ropes = new int[N];
        for(int i =0;i<N;i++){
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);
        int maxWeight = 0;
        for(int r : ropes){
            maxWeight = Math.max(maxWeight,N*r);
            N--;
        }
        System.out.println(maxWeight);
    }
}
