package w2_1_accessmodifier.a;

public class A {

    //private 접근 제어자
    // 같은 패키지에서만 접근 가능
    private static void printPrivateStrA() {
        System.out.println("privateStrA");
    }

    //Default 접근 제어자 (private 이 기본값. 패키지 내부에서만 접근가능)
    static void printPackagePrivateStrA() {
        /* package-private */
        System.out.println("packagePrivateStrA");
    }

    //protected 접근 제어자
    // (private 보다 조금 더 오픈.상속관계 일시 접근허용)
    // 상속관계 없는 패키지로부터 보호
    protected static void printProtectedStrA() {
        System.out.println("protectedStrA");
    }

    //public 접근제어자
    // 아무데서나 접근 가능
    public static void printPublicStrA() {
        System.out.println("publicStrA");
    }

    /* 1. private 멤버 접근 가능한 유일한 위치 */
    public static void main(String[] args) {
        A.printPrivateStrA();
        A.printPackagePrivateStrA();
        A.printProtectedStrA();
        A.printPublicStrA();
    }
}