package w3_4_functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AdvFuncInterfaceSample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe");

        // 리스트의 각 요소를 출력하는 람다 표현식
        // 인터페이스타입<인풋 타입> 함수이름 = (인풋값) -> 수행동작
        Consumer<String> myPrinter = (name) -> System.out.println(name);
        // 함수형 인터페이스는 객체화 했을때,
        // myPrinter 는 동작이지만 파라미터로 할당해, 다른함수 스코프에서 스택을 쌓도록 할당가능하다.
        names.forEach(myPrinter);


        // 정적 메소드 참조하는 람다 표현식
        MyMathIntBinaryOperation multiplication = (a, b) -> Math.multiplyExact(a, b);
        // 코드 재사용도 가능
        // "인라인 정의" 를 매번 하지않고, 간결하게 작성 가능

        multiplication.operate(1, 2);


        //람다표현식 안에서 예외처리도 가능
        MyMathIntBinaryOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        };
        System.out.println(division.operate(1, 2));

        Runnable myRun = () -> System.out.println("Hello World!");
        myRun.run();
    }
}
