package w3_2_MyObject;

import java.util.Objects;

public class MyObject {
    private int field1;
    private String field2;

    public MyObject(int field1, String field2) {
        this.field2 = field2;
        this.field1 = field1;
    }

    //getters, setters 생략

    @Override
    public boolean equals(Object obj) {
        //객체 동일성 비교 구문
        if (this == obj) return true;
        //null이 들어왔을때, 클래스 다른경우 false
        if (obj == null || getClass() != obj.getClass()) return false;

        //클래스 명시적 캐스팅 포함되거나, 내용비교 통한 동일성 비교로 오버라이딩
        MyObject myObject = (MyObject) obj;
        return field1 == myObject.field1 && Objects.equals(field2, myObject.field2);
    }

    @Override
    //hashCode() : 해시코드
    public int hashCode() {
        //해시값 계산 기초가 되는 인풋을 변경하는 형태로, 나만의 해시코드 생성가능
        return Objects.hash(field1, field2);
        //다양한 케이스에서 hashCode() 오버라이딩 가능
        // -> 64bit 해시코드를 특정 객체에 적용하고싶다?
        // -> 해시함수를 통해 충돌이 덜 나오거나 특정 결과가 나오게 변경하고싶다?
    }

    @Override
    //toString() : 객체를 문자열로 표현
    public String toString() {
        return "MyObject{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                '}';
    }

    @Override
    //객체 복사본 생성 clone()
    protected MyObject clone() throws CloneNotSupportedException {
        // 복제 로직 추가
        return new MyObject(this.field1, this.field2);
    }

    //finalize() : 객체 소멸시 호출되는 메소드. GC가 제거
    // 객체 소멸시 실행할 명령 지정도 가능
    // 오버라이드는 안한다.


    public static void main(String[] args) {
        MyObject myObject1 = new MyObject(1, "a");
        myObject1.field1 = 1;
        myObject1.field2 = "Hello";


    }

}