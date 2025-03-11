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

class Main {
    public static void main(String[] args) {
        계산기.합(a: 10, b: 20);



    }

}

class 계산기 {
    static int 합(int a, int b) {
//
        System.out.println("a : " +a);
        System.out.println("b : " +b);

        System.out.println("a + b : "+(a + b));
    }
}