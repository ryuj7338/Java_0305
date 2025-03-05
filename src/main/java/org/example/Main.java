package org.example;

    // 아래의 코드를 따라친 다음
    // 결과가 왜 이렇게 나오는가?를 서술(순차적으로, 한국어로)


class Main {
    public static void main(String[] args) {

//        int rows = 4;
//
//        for (int i = 1; i <= rows; i++) { // i는 row가 4니까 i는 1부터 4까지 4번 출력
//            for (int k = 1; k <= i; k++) { // k도 i가 4까지 출력이니까 4번 출력
//                System.out.print("* ");
//            }   // k가 1일때 i도 1이므로 한 번 줄바꿈없이 출력후 i에 해당하는 for문으로 빠져나감.
//            System.out.println();   // "*"넣으면 "*"추가되면서 줄바꿈됨.
//        }   // i에 해당하는 for문은 줄바꿈하면서 출력


        int n = 3;

        for(int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n -1 ; i >= 1; i--) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

