package w3_2_OOP;

import lombok.*;

@Data
//Data 어노테이션 안에 이게 다 있음
    @Getter
    @Setter
//    @ToString
//    @EqualsAndHashCode
//    @RequiredArgsConstructor
public class LombokUsageSample {
    private int age = 20;
    private boolean employed = false;

    /* lombok 을 사용하면 아래와 같은 메서드를 수동 생성할 필요가 없어짐
    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public boolean isEmployed() {
        return employed;
    }
    */

    public static void main(String[] args) {
        LombokUsageSample sul = new LombokUsageSample();
        System.out.println(sul.getAge());
        sul.setAge(30);
        System.out.println(sul.getAge());

        System.out.println(sul.isEmployed());
        sul.setEmployed(true);
        System.out.println(sul.isEmployed()); //employed 변수에 대한 Getter 명시 안했는데도 사용이 가능. (일반적으로 is~ 로 getter 생성됨)
    }
}