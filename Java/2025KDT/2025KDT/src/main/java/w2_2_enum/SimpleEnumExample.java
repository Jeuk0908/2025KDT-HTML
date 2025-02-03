package w2_2_enum;

// 사용 예시
public class SimpleEnumExample {
    public static void main(String[] args) {
        SimpleEnumDay today = SimpleEnumDay.THURSDAY;

        // Enum 값 출력
        System.out.println("Today is: " + today);

        // Enum 객체 비교 (값 비교도 가능)
        if (today == SimpleEnumDay.MONDAY) {//같은 객체인지 동일연산자로 확인
            System.out.println("Start of the work week!");
        }

        // 모든 Enum 값 순회
        for (SimpleEnumDay day : SimpleEnumDay.values()) {
            System.out.println(day);
        }
    }
}
