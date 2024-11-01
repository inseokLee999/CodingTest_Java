package day1031;

import java.util.Scanner;

public class 단어의개수1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.trim().isEmpty()){
            System.out.println(0);
        }else System.out.println(str.trim().split(" ").length);
    }
}
