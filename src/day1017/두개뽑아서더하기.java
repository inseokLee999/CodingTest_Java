package day1017;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int temp = numbers[i]+numbers[j];
                if(!numList.contains(temp)) numList.add(temp);
            }
        }
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}
