package w3_4_functionalInterface;


//원하는 인풋아웃풋 포맷을, 메소드 시그니처로 담아주고
//선언부 상단에 @FunctionalInterface 어노테이션 달기
@FunctionalInterface
interface MyMathIntBinaryOperation {
    // ReturnV operate(OperandT a, OperandU b);
    int operate(int a, int b); //함수의 이름과 인풋타입만 지정
}