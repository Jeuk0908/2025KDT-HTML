package BackJun_Bronze;

import java.util.*;

public class Distributed_processing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //테스트케이스 만큼 반복
        for(int i=0;i<n;i++) {
            //a 와 b 입력
            int a=sc.nextInt();
            int b=sc.nextInt();

            int result=1;
            //b 만큼 a%10 연산 반복
            for(int j=0;j<b;j++) {
                //a 의 b제곱 했을때의 끝자리수 만 나오게 구현
                //a 를 제곱할수록 수가 기하급수적으로 커지기 때문에
                // % 10 을 추가해서 작아지게 만든것 => 10의자리는 pc가 10대이기 때문에 딱 떨어짐(일의자리만 보면 된다)
                result=(result*a)%10;
            }
            //만약 0이 나오면 수가 딱 떨어지니 마지막인 10번이 처리한다는 뜻이니까 10 출력
            if(result==0) System.out.println("10");
            else System.out.println(result);
        }
    }
}