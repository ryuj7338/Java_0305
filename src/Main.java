package org.example;




public class Main {
    public static void main(String[] args) {
        //1
       자동차 a = new 자동차();
       a.달리다();
       a.서다();
       //2
       new 자동차().달리다();
       new 자동차().서다();

       //3
       자동차.달리다();
       자동차.서다();


    }

}

class 자동차 {
    // static: 객체화하지 않고 쓰겠다. 설계도 차원에서 기능 뽑아서 쓰고싶다.
    static void 달리다() {
        System.out.println("달리다");
    }
    void 서다() {
        System.out.println("서다");
    }
}
