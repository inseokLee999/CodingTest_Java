package day1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 어린왕자1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 0;j<n;j++){
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                if(Boolean.logicalXor(inCircle(x1,y1,cx,cy,r), inCircle(x2,y2,cx,cy,r))) count++;
            }
            System.out.println(count);
        }

    }

    private static boolean inCircle(int x1, int y1, int cx, int cy, int r) {
        return Math.sqrt(Math.pow(cx - x1, 2) + Math.pow(cy - y1, 2)) < r;
    }
}
