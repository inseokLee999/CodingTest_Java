package day1101;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A를B로바꾸기16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        long a = Long.parseLong(ab.split(" ")[0]);
        long b = Long.parseLong(ab.split(" ")[1]);
        System.out.println(BFS(a, b));
    }

    private static int BFS(long a, long b) {
        Queue<Long> queue = new LinkedList<>();
        queue.add(a);
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                long cur = queue.poll();
                if (cur == b) {
                    return count;
                } else {
                    if (2 * cur <= b) queue.add(2 * cur);
                    if (cur * 10 + 1 <= b) queue.add(cur * 10 + 1);
                }
            }
        }
        return -1;
    }
}
