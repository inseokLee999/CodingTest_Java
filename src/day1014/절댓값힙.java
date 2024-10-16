package day1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            //절댓값 작은 데이터 우선
            //절댓값이 같은 경우 음수 우선
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs){
                return o1>o2 ? 1 : -1;
            }
            return first_abs-second_abs;
        });
        for(int i = 0; i < N; i++){
            int request = Integer.parseInt(reader.readLine());
            if(request == 0){
                if(queue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(queue.poll());
                }
            }else{
                queue.add(request);
            }
        }
    }
}
