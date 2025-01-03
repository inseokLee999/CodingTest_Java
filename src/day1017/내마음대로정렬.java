package day1017;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 내마음대로정렬 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);
                if(c1 == c2){
                    return o1.compareTo(o2);
                }
                return c1-c2;
            }
        });
        return strings;
    }
}
