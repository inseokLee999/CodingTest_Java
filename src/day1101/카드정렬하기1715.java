package day1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 카드정렬하기1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> cards = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(br.readLine()));
        }
        int answer = 0;
        while(cards.size()>1){
            int a = cards.poll();
            int b = cards.poll();
            answer +=a+b;
            cards.add(a+b);
        }
        System.out.println(answer);
    }
}
