package day1101;

import java.util.Arrays;
import java.util.Scanner;

public class 터렛1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<T;i++){
            String[] str = sc.nextLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int r1 = Integer.parseInt(str[2]);
            int x2 = Integer.parseInt(str[3]);
            int y2 = Integer.parseInt(str[4]);
            int r2 = Integer.parseInt(str[5]);
            calc(x1,y1,r1,x2,y2,r2);
        }
    }
    static void calc(int x1,int y1,int r1,int x2,int y2,int r2){
        double circle = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        if(circle == 0){
            if(r1==r2){
                System.out.println(-1);
            }else{
                System.out.println(0);
            }
        }else if(circle<Math.abs(r1-r2) || circle>r1+r2){
            System.out.println(0);
        }else if(circle==Math.abs(r1-r2) || circle==r1+r2){
            System.out.println(1);
        } else if (circle<r1+r2) {
            System.out.println(2);
        }
    }
}
