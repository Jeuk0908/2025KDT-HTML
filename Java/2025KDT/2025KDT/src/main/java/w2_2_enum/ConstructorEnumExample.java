package w2_2_enum;

// 사용 예시
public class ConstructorEnumExample {
    public static void main(String[] args) {
        //enum열거형 객체는 생성자 선언 없이 정적변수처럼, 조회하는것처럼 불러올 수 있음.
        //메모리 사용 가장 효율적인 형태 => Singleton 패턴의 가장 컴팩트한 적용 가능
        ConstructorEnumDay today = ConstructorEnumDay.FRIDAY;

        // Enum 값과 필드 출력
        System.out.println("Today is: " + today);
        System.out.println("Day type: " + today.getType());

        // 모든 Enum 값과 필드 순회
        for (ConstructorEnumDay day : ConstructorEnumDay.values()) {
            System.out.println(day + " is a " + day.getType());
        }
    }
}
