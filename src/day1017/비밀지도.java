package day1017;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        System.out.println(toBinary(9, n));
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];
        for (int i = 0; i < n; i++) {
            strArr1[i] = toBinary(arr1[i], n);
            strArr2[i] = toBinary(arr2[i], n);
        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                /*if(strArr1[i].charAt[j] ||strArr2[i].charAt[j]){
                sb.append('#');
            }else{
                    sb.append(' ');
                }
            }
            */
                System.out.println(strArr1[i]);
                answer[i] = sb.toString();

            }
        }

        return answer;
    }

    private String toBinary(int num, int n) {
        int[] decode = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            decode[i] = num % 2;
            num /= 2;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(decode[i]);
        }
        return sb.toString();
    }
}
