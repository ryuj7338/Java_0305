
package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" 1개 입력 : ");

        String num = sc.nextLine();

        System.out.print("num : " +num);

        // %c : 문자 서식 지정자
        // %d : 정수(10진수) 서식 지정자
        // %f : 실수
        // %s : 문자열
    }
}

