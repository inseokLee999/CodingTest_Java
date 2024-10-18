package day1017;

import java.util.*;

class Solution {
    public int solution(int n, int[][] vertex) {
        // 1. 그래프를 인접 리스트로 변환
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : vertex) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // 2. BFS를 위한 준비
        int[] distances = new int[n + 1];
        Arrays.fill(distances, -1);  // 초기값: -1 (방문하지 않은 노드)
        Queue<Integer> queue = new LinkedList<>();

        // 1번 노드에서 시작
        distances[1] = 0;
        queue.offer(1);

        // 3. BFS로 각 노드의 최단거리 구하기
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph.get(current)) {
                if (distances[neighbor] == -1) {  // 아직 방문하지 않은 노드
                    distances[neighbor] = distances[current] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        // 4. 가장 멀리 떨어진 노드들의 개수 구하기
        int maxDistance = 0;
        int count = 0;
        for (int dist : distances) {
            if (dist > maxDistance) {
                maxDistance = dist;
                count = 1;
            } else if (dist == maxDistance) {
                count++;
            }
        }

        return count;
    }
}