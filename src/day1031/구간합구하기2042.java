package day1031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 구간합구하기2042 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int d = 0;
        while (Math.pow(2, d) < N) {
            d++;
        }
        int base = (int) Math.pow(2, d);//2^d base index
        long[] tree = new long[base*2];
        for (int i = 0; i < N; i++) {
            tree[base + i] = Long.parseLong(br.readLine());
        }
        //초기화
        for (int i = base - 1; i > 0; i--) {
            tree[i] = tree[2 * i] + tree[2 * i + 1];
        }
        long[][] query = new long[M+K][3];
        for(int i = 0;i<query.length;i++) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            query[i] = new long[]{a, b, c};
        }
        for(long[] q: query){
            long a = q[0];
            int b = (int)q[1];
            long c = q[2];
            if(a==1){//a=1인경우
                b = base-1+b;
                tree[b] = c;
                while(b!=1){
                    tree[b/2] = tree[b/2*2] + tree[b/2*2+1];
                    b/=2;
                }
            }else{//a=2인경우
                int start = b+base-1;
                int end = (int)c+base-1;
                long count = 0;
                HashSet<Integer> list = new HashSet<>();
                while(start<=end){
                    if(start%2==1){
                        list.add(start);
                    }
                    if(end%2==0){
                        list.add(end);
                    }
                    start = (start+1)/2;
                    end = (end-1)/2;
                }
                for(Integer l :list){
                    count +=tree[l];
                }
                System.out.println(count);
            }
        }
    }
}
