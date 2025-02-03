package w2_2_enum;

public enum Brands {
    TOYOTA("Japan"),
    FORD("USA"),
    FERRARI("Italy"),
    HYUNDAI("Korea");

    private final String type; //문자열 타입으로 필드 고정.(불변)

    //생성자
    Brands(String type) {
        this.type = type; //전달받은 값을 type 에 저장
    }

    //메소드
    //각 객체의 정보를 외부에서 읽을 수 있게 해주는 함수 (그래서 public)
    public String getType() {
        return type;
    }
}
