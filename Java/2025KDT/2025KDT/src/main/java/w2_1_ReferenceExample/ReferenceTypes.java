package w2_1_ReferenceExample;

public class ReferenceTypes {
    public static void main(String[] args) {
        // 클래스
        String name = "John";
        System.out.println("Name: " + name);

        // 배열 array
        int[] numbers = {1, 2, 3, 4, 5}; //중괄호 사용
        for (int number : numbers) { //향상된 for 문
            System.out.println("Number: " + number);
        }
    }
}