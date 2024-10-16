package day1016;

import day01_1002.solution;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public static String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNumbers, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String order1 = o1+o2;
                String order2 = o2+o1;
              return order2.compareTo(order1);
            }
            }
        );
        if(strNumbers[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String str : strNumbers){
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers)); // 출력: "6210"

        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers2)); // 출력: "9534330"
    }
}
