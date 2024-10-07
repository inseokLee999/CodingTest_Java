package day02_1003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1004 {
    public static String solution1(String my_string) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String answer = "";
        for (char c : my_string.toCharArray()) {
            for (int i = 0; i < vowels.length; i++) {
                if (vowels[i] == c) {
                    break;
                }
                if (i == vowels.length - 1) {
                    answer += c;
                }
            }
        }
        return answer;
    }

    public static String solution2(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static int solution3(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);
        Arrays.asList(sides).forEach(System.out::println);
        if (sides[2] > sides[0] + sides[1]) {
            answer = 2;
        }
        return answer;
    }

    public static String solution4(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }

    public static int[] solution5(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(numlist).filter(i -> i % n == 0).forEach(list::add);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static String solution6(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }

    public static int[] solution7(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{odd, even};
    }

    public static int solution8(String my_string, String is_suffix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.substring(i).equals(is_suffix)) {
                answer=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(solution7(new int[1, 2, 3, 4, 5]));
    }
}
