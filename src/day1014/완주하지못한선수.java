package day1014;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String player : participant){
            map.put(player,map.getOrDefault(player,0)+1);
        }
        for(String player : completion){
            map.put(player,map.get(player)-1);
        }
        for(String key : map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }

        return "";
    }
}
