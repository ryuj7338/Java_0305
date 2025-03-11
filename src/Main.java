package org.example;
//객체 => 폴더

//클래스의 구성 요소
//속성(상태, 단순 데이터) - field(변수), 명사
//기능(행동, 실행 데이터) - method(함수), 동사



public class Main {
    public static void main(String[] args) {
        사람 a = new 사람();
        a.age = 23;
        a.name = "김철수";
        a.isMarried = false;
        a.introduce();  // // this : a와 연결된 객체(인스턴스)의 introduce

        사람 b = new 사람();
        b.age = 24;
        b.name = "박영수";
        b.isMarried = true;
        b.introduce();

    }
}

class 사람 {
    int age;
    String name;
    boolean isMarried;

    void introduce() {
//        int age = this.age; // 생략o
//        String name = this.name;
//        boolean isMarried = this.isMarried;

        System.out.println("==자기소개==");
        System.out.printf("이름 : %s\n",this.name);
        System.out.printf("나이 : %d\n", this.age); // this.age 바로 넣을 수 있음
        System.out.printf("결혼여부 : %b\n", this.isMarried);
    }

//    void hello() {
//        System.out.println("hello 실행됨");
//    }
}
