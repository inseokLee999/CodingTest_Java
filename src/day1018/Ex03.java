package day1018;

import java.util.*;

public class Ex03 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer,Double> failure = new HashMap<>();
        Arrays.sort(stages);
        //실패율 구하기
        double startIndex = 0;
        int endIndex = 0;
        for(int i =1;i<N+1;i++){
            while(endIndex < stages.length && stages[endIndex]==i){
                endIndex++;
            }
            failure.put(i,(endIndex-startIndex)/(stages.length-startIndex));
            startIndex = endIndex;
        }
        //정렬
        // 실패율을 내림차순으로 정렬 (실패율이 같으면 스테이지 번호 오름차순)
        List<Integer> stageList = new ArrayList<>(failure.keySet());
        stageList.sort((a,b)->{
            double diff = failure.get(a)-failure.get(b);
            if(diff>0){
                return 1;
            }else if(diff<0){
                return -1;
            }else{
                return a-b;
            }
        });
        /*List<Integer> stageList = new ArrayList<>(failure.keySet());
        stageList.sort((a, b) -> {
            double diff = failure.get(b) - failure.get(a);
            if (diff > 0) return 1;
            else if (diff < 0) return -1;
            else return a - b;
        });

        // 정렬된 스테이지 번호를 answer 배열에 저장
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i);
        }*/

        return answer;

    }
}
