package BackJun_Bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineUp {
    // 뽑은 수
    public static List<Integer> numList = new ArrayList<>();
    // 학생 줄
    public static List<Integer> lineUp = new ArrayList<>();

    public static void main(String[] args) {
        // 학생 수 입력
        Scanner sc = new Scanner(System.in);
        int stuCount = sc.nextInt();
        sc.nextLine();

        // 뽑은 숫자 입력
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        for (String number : numbers) {
            numList.add(Integer.parseInt(number));
        }

        // 줄 세우기
        for (int i = 0; i < stuCount; i++) {
            int position = numList.get(i);

            // position 위치에 학생 번호(i + 1) 삽입
            lineUp.add(lineUp.size() - position, i + 1);
        }

        // 결과 출력 (숫자만 공백으로 구분하여 출력)
        for (int student : lineUp) {
            System.out.print(student + " ");
        }
    }
}
