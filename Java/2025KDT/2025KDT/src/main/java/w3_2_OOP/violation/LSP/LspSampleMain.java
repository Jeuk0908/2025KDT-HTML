package w3_2_OOP.violation.LSP;

public class LspSampleMain {
    public static void main(String[] args) {
        Bird pigeon = new pigieon();
        Bird ostrich = new Ostrich();

        makeBirdFly(pigeon);
        makeBirdFly(ostrich); // 예외 발생!
    }

    static void makeBirdFly(Bird bird) {
        bird.fly(); // throws 감지 불가능
    }
}

class Bird {
    void fly() {
        // 새가 날아감
    }
}

class Ostrich extends Bird { //extends 라는 키워드를 상위객체(Bird)에서 정상동작하는 메소드를 예외범위로 내보냄으로서 위반.
    void fly() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("타조는 날지 못합니다.");
    }
}

class pigieon extends Bird {
    void fly() {
        System.out.println("비둘기 날아가요");
    }
}