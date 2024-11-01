package day1031;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 단어정렬1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> strSet = new HashSet<>();
        for(int i = 0; i < N; i++) {
            strSet.add(br.readLine());
        }
        List<String> strList= new ArrayList<>(strSet);
        strList.sort((a, b) -> {
            String i = String.valueOf(a);
            String j = String.valueOf(b);
            if (i.length() == j.length()) {
                return i.compareTo(j);
            }
            return i.length() - j.length();
        });
        strList.forEach(System.out::println);
    }
}
