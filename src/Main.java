package org.example;




public class Main {
    public static void main(String[] args) {

        MyClass a = new MyClass;
        a.hi();

        new MyClass().hi();

        funA();


    }

    static void funA() {
        System.out.println("funA 실행됨");
    }
}

class MyClass {
    void hi() {
        System.out.println("hi 실행됨");
    }

}
