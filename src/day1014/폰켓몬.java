package day1014;

import java.util.HashMap;
import java.util.HashSet;

public class 폰켓몬 {
    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // 2. 선택 가능한 최대 폰켓몬 종류 수는 nums.length / 2
        int maxSelectable = nums.length / 2;

        // 3. 중복을 제거한 종류의 개수와 maxSelectable 중 작은 값 반환
        return Math.min(set.size(), maxSelectable);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
    }

}
