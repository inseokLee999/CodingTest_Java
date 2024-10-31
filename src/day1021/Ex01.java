package day1021;

import java.util.*;

public class Ex01 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> myMap = new HashMap<>();
        for(int t : tangerine){
            if(myMap.containsKey(t)){
                myMap.replace(t,myMap.get(t)+1);
            }else{
                myMap.put(t,1);
            }
        }
        //가장 큰 value 순으로 정렬
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(myMap.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));  // 가장 큰 것부터
        List<Map.Entry<Integer,Integer>> myList = new ArrayList<>(myMap.entrySet());
        myList.sort((a,b)->a.getValue().compareTo(b.getValue()));
        int total = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            total += entry.getValue();
            answer++;
            if (total >= k) {
                break;
            }
        }

        return answer;
    }
}
