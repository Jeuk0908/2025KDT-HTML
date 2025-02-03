package w2_1_PrimitiveExample;

public class PrimitiveTypes {
    public static void main(String[] args) {
        //기본 자료형
        int age = 25;         // 정수형
        double height = 175.5; // 실수형
        char grade = 'A';     // 문자형
        boolean isAdult = true; // 논리형

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Adult: " + isAdult);

        int myOct = 02122; //십진수 1106
        int myHex = 0x452; //십진수 1106
        System.out.println("myOct: " + myOct);
        System.out.println("myHex: " + myHex);

        int myDecimal = 1_000_000; //가독성을 위해 언더바로 컴마 표시 대체.
        System.out.println("myDecimal: " + myDecimal);
    }
}