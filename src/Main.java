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
// 문제 : 아래와 같이 출력 되도록 해주세요.

class Main {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {

    public static int nToMSum(int n, int m) {
        int sum = 0;


    }
}

