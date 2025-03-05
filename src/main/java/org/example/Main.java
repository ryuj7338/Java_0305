package org.example;

// 문제 : 1부터 5까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//
////        int i = 1;
////
//////        while(i <=5){
//////            System.out.println(i);
//////            i++;
//////        }
////        // 출력
////        // 1
////        // 2
////        // 3
////        // 4
////        // 5
//
//        int sum = 0;
//        int i = 1;
//
//        while (i <= 5){
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);
//    }
//}



// 문제 : -100부터 25까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//
////        int i = -100;
////
////        while(i <=25) {
////            System.out.println(i);
////            i++;
////        }
//        // 출력
//
//        int sum = 0;
//        int i = -100;
//
//        while(i <= 25){
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);
//    }
//}
//
//
//// 문제 : 아래와 같이 출력해주세요.
//// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        int i = 1000;
//
//
//
////        while(i >= -500) {
////            System.out.println(dan + " * " + i + " = " + dan * i);
////            i--;
////        }
//
//        while(i >= 1) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i--;
//        }
//
//
//
//        // 출력
//    /*
//    8 * 1000 = 8000
//    ...
//    8 * -500 = -4000
//    */
//    }
//}
//


//
//// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
//// 조건 : 2중 while문 사용
//
class Main {
    public static void main(String[] args) {

//        int i = 1;
//
//
//        while (i <= 10) {
//
//            int j = 1;
//
//            while (j <= 3) {

//                System.out.println(j);
//
//                j++;
//            }
//
//            i++;
//
//       }

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println(j);
            }
            System.out.println("===");

        }


    }
}

//class Main {
//    public static void main(String[] args) {
//
//        System.out.println("== while ==");
//        int i = 1;
//        while(i <= 3){
//            System.out.println(i);
//            i++;
//        }
//
//        System.out.println("== for ==");
//        for (int j = 1; j <= 3; j++) {
//            System.out.println(j);
//        }
//
//
//    }
//}