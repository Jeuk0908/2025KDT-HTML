package w3_4_functionalInterface;
import java.util.function.BinaryOperator;

public class BasicFuncInterfaceSample {
    public static void main(String[] args) {

        //람다 표현식 사용해서 두 수를 더하기
        //"기능" 이라는 단위가 생긴것.
        // 람다 => 함수의 수학적 용어
        BinaryOperator<Integer> add = //함수형 인터페이스 타입 선언, "기능" 단위 핸들링 가능
                (a, b) -> a + b;
        int result = add.apply(3, 4); // apply 는 인터페이스에서 이름만 정해져있음
        System.out.println(result);


        // 내가 직접 선언한 함수형 인터페이스 사용하기
        MyMathIntBinaryOperation addition = (a, b) -> a + b;  // 람다 표현식으로 함수 바디 구현
        result = addition.operate(1, 2); //구현한 함수 사용
        System.out.println(result); // 3

    }
}
