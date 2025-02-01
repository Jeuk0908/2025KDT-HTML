package BackJun_Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //정수값 입력
        int N = input.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            //N개의 정수 계속 입력받기
            arr[i] = input.nextInt();
        }

        //sort 함수로 오름차순 정렬
        Arrays.sort(arr);
        //제일 작은값이 오는 0번인덱스, 제일 큰 값이 오는 마지막 인덱스 출력
        System.out.print(arr[0] + " " + arr[N - 1]);
    }
}