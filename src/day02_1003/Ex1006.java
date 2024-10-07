package day02_1003;

public class Ex1006 {
    public static String solution1(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n);
        return answer;
    }

    public String solution2(String my_string, int[] index_list) {
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }

    public static int solution4(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                n += 1;
            } else if (control.charAt(i) == 's') {
                n -= 1;
            } else if (control.charAt(i) == 'd') {
                n += 10;
            } else if (control.charAt(i) == 'a') {
                n -= 10;
            }
        }
        return n;
    }

    public int[] solution5(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }
        return answer;
    }

    public static int solution6(int a, int b) {
        return Math.max(2 * a * b, calc(a, b));
    }

    private static int calc(int a, int b) {
        return Integer.parseInt(Integer.toString(a) + Integer.toString(b));
    }

    public int[] solution7(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 0) {
                answer[i] = arr[i] + k;
            } else {
                answer[i] = arr[i] * 3;
            }
        }

        return answer;
    }

    public String solution8(String[] str_list, String ex) {
        String answer = "";
        for (String str : str_list) {
            if (str.contains(ex)) {
                continue;
            }
            answer += str;
        }
        return answer;
    }

    public int solution9(String str1, String str2) {
        int answer = 0;
        if (str2.contains(str1)) {
            answer = 1;
        }
        return answer;
    }

    public int solution10(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i=0;i<num_list.length;i++){
            if (i % 2 == 0) {
                even+=num_list[i];
            }else{
                odd+=num_list[i];
            }
        }
        return Math.max(odd, even);
    }

    public static void main(String[] args) {
        System.out.println(solution6(91, 2));
    }
}
