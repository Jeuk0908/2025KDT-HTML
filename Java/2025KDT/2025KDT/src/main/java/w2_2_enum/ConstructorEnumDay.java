package w2_2_enum;

public enum ConstructorEnumDay { //enum 으로 각각의 값이 상수로
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String type;


    // 생성자
    ConstructorEnumDay(String type) {
        this.type = type;
    }

    // Getter 메서드
    public String getType() {
        return type;
    }
}

