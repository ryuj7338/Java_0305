package org.example;




public class Main {

    int a =20;  // 전역 변수


    public static void main(String[] args) {

        int a = 30;

        계산기.합(a: 10, b: 20)


    }

}

class 계산기 {
    int a = 40;

    static void 합(int a, int b) {
//        int a =50;  // 지역 변수

        System.out.println("a : " +a);
        System.out.println("b : " +b);

        System.out.println(a + b);
    }
}