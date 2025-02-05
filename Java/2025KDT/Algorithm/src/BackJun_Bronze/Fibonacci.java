package BackJun_Bronze;

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n){
        // 번호가 0, 1 이면 피보나치 수 도 0, 1 이기 때문에 그냥 리턴
        if (n <= 1){
            return n;
        }
        //memo 배열 생성, 0 포함한 입력된 수 + 1 만큼 인덱스 확보
        int memo[] = new int[n+1];
        memo[0] = 0;
        memo[1] = 1;

        //2번 자리부터 수가 바뀌니깐 2부터 계산
        for (int i = 2; i <= n; i++){
            //memo 배열의 2번 자리부터 이전 두 수의 합 계산
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }

    public static void main(String[] args) {
        //탑다운 방식의 DP(Dynamic Programing)
        Scanner sc = new Scanner(System.in);
        System.out.println(fib(sc.nextInt()));
        sc.close();

    }
}