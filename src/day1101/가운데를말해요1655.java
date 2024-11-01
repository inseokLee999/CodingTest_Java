package day1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class 가운데를말해요1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> pq = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            pq.add(num);
            Collections.sort(pq);
            if(pq.size()%2==0){//짝수개
                System.out.println(pq.get(pq.size()/2-1));
            }else{//홀수개
                System.out.println(pq.get(pq.size()/2));
            }
        }
    }
}
