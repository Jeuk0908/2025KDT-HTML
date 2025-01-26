package BackJun_Bronze;

import java.util.Scanner;

public class HowManyWords {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.nextLine().trim(); // 입력받은 문자열 앞뒤 공백 제거
        String[] words = input.split("\\s+"); // 여러 공백을 기준으로 나누기
        System.out.println(words.length);

    }
}
