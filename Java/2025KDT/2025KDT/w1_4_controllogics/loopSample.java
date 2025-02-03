package w1_4_controllogics;

public class loopSample {
    public static void main(String[] args) {
        int n = 10;

        //while 문은 항상 탈출조건 명확해야함
        //틸출조건 달성 지연 도 고려
        while (n > 0) {
            n -= 1;
            System.out.println(n);
        }

        //do while 문
        //틸출조건 달성 만 아니라
        //최소한의 코드 실행 제어
        do {
            n -= 1;
            System.out.println(n);
        } while (n > 0);


        // ######## 기본 for 문 ########
        // 횟수 기준 판단 추가되어서
        // 탈출조건 만족하는지 검토하기가 좋음
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }


        // ######## 향상된 for 문 ########
        // 한정된 횟수를 배열로 구현해서 작성 (한정된 크기를 순회하기떄문에 안전)
        // 배열 요소값 들고 매 회차 반복
        int[] arrayA = {1,2,3,4,5};

        for (int aa: arrayA) {
            if (aa == 3) {
                //continue;
                //break;
                //return; 도 가능하지만 바람직하진 않다.
            }
            System.out.println(aa);
        }
    }
}
