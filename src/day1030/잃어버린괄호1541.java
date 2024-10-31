package day1030;

import java.util.Scanner;

public class 잃어버린괄호1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // - 로 분리 후에 +로 분리후 더하기
        String str = sc.nextLine();
        String[] sArr = str.split("-");
        int answer = 0;
        for (String s : sArr[0].split("\\+")) {
            answer += Integer.parseInt(s);
        }

        for (int i = 1; i < sArr.length; i++) {
            String[] temp = sArr[i].split("\\+");
            int tempNumber = 0;
            for (String t : temp) {
                tempNumber += Integer.parseInt(t);
            }
            answer -= tempNumber;
        }
        System.out.println(answer);
    }
}
