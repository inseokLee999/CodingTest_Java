package day1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분함1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        //투포인터로
        int minLength = Integer.MAX_VALUE;
        int left = 0,sum = 0;
        for(int right = 0; right <N; right++){
            sum+=numbers[right];
            while(sum>=S){
                minLength = Math.min(minLength,right-left+1);
                sum-=numbers[left];
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE){
            System.out.println(0);
        }else System.out.println(minLength);
    }
}
