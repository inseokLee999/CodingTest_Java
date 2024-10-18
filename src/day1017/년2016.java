package day1017;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 년2016 {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int correct1 = 0;
        int correct2 = 0;
        int correct3 = 0;
        for (int i = 0; i < answers.length; i++) {
            int temp = answers[i];
            if (temp == supo1[i % supo1.length]) {
                correct1++;
            }
            if (temp == supo2[i % supo2.length]) {
                correct2++;
            }
            if (temp == supo3[i % supo3.length]) {
                correct3++;
            }
        }
        int[] answer = {correct1, correct2, correct3};
        int max = Math.max(correct1, Math.max(correct2, correct3));
        System.out.println(max);
        List<Integer> list = new ArrayList<>();
        if (max == correct1) {
            list.add(1);
        }
        if (max == correct2) {
            list.add(2);
        }
        if (max == correct3) {
            list.add(3);
        }
        return answer;
    }
}
