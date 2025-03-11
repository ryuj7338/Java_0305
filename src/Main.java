package org.example;

// <눈에 익혀 두기>
// void는 retrun 안 할 의무가 있다. void가 없는 경우는 return을 꼭 해야 한다.
// 전역변수 : 전역 공간(함수 외)에서 만든 변수
// 지역변수 : 지역 공간(함수 내)에서 만든 변수
// 매개변수 parameter : 매개체
// 인자, 인수, args : 함수 실행할 때 옵션
// static : 객체화 ㄴㄴ
// ----------------------------------------------------
// 알아둘 키워드 : 리턴 타입, 리턴, 리턴 밸류

//class Main {
//    public static void main(String[] args) {
//        int 결과;
//
//        결과 = 계산기.합(10, 20);
//        System.out.println("결과 : " + 결과);
//        // 출력 => 결과 : 30
//
//        결과 = 계산기.합(30, 20);
//        System.out.println("결과 : " + 결과);
//        // 출력 => 결과 : 50
//
//        결과 = 계산기.합(30, 70);
//        System.out.println("결과 : " + 결과);
//        // 출력 => 결과 : 100
//
//        결과 = 계산기.차(30, 70);
//        System.out.println("결과 : " + 결과);
//        // 출력 => 결과 : -40
//
//        결과 = 계산기.곱(3, 7);
//        System.out.println("결과 : " + 결과);
//        // 출력 => 결과 : 21
//    }
//}
//class 계산기 {
//    static int 합(int a, int b) {
//        System.out.println(a+b);
//
//        return a + b;
//    }
//    static  int 차(int a, int b) {
//        System.out.println(a - b);
//
//        return a - b;
//    }
//    static  int 곱(int a, int b) {
//        System.out.println(a * b);
//
//        return a * b;
//    }
//}


class Main {
    public static void main(String[] args) {
        // 예시 시작
        int c = 20 + Math.더하기(10, 20);
        System.out.println(c);
        // 예시 끝

        int 결과1 = Math.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2= Math.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55
    }
}

class Math {
    // static => 본사직원
    // static은 현재 클래스에 지금당장 존재한다.
    static int 더하기(int a, int b) {
        // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
        int c = a + b;

        // return 값의 타입과 함수명의 앞부분이 같아야 한다.
        // return => 변신
        return c;
    }
    static  int
}