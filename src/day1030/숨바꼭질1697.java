package day1030;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질1697 {
    /*
    * bfs 로 찾아야할듯?
    * check[100000]
    * bfs
    * while(!queue.isEmpty()){
    * int length = queue.size();
    *
    *  queue.push(N-1,N+1,N*2)
    * )
    * */
    static boolean[] check = new boolean[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int k = Integer.parseInt(str.split(" ")[1]);
        System.out.println(bfs(n,k));
    }

    private static int bfs(int n,int k) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while(!queue.isEmpty()){
            int length = queue.size();
            for(int i = 0;i<length;i++){
                int temp = queue.poll();
                check[temp] = true;
                if(temp==k){
                    return count;
                }
                if(temp-1>=0&&!check[temp-1]){
                    queue.add(temp-1);
                }
                if(temp+1<=100000&&!check[temp+1]){
                    queue.add(temp+1);
                }
                if(temp*2<=100000&&!check[temp*2]){
                    queue.add(temp*2);
                }
            }
            count++;
        }
        return count;
    }
}
