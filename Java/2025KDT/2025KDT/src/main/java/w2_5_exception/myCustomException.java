package w2_5_exception;

public class myCustomException extends RuntimeException {
    public myCustomException(String message) {
        super("이 Exception 은 OOO 한 경우를 예제로 나타냅니다.");
    }

    public myCustomException(String message, Throwable cause) {}
}
