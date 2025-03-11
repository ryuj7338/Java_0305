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
        계산기.더한결과를화면에출력(10,20);

        // 출력 => 결과 : 30

        계산기.더한결과를화면에출력(10,20);
        // 출력 => 결과 : 30

        계산기.뺀결과를화면에출력(50,20);
        // 출력 => 결과 : 30
    }
}
class 계산기 {
    static void 더한결과를화면에출력(int a, int b){


        System.out.println("결과 : "+(a+b));
    }
    static void 뺀결과를화면에출력(int a, int b){


        System.out.println("결과 : "+(a - b));

    }

}


