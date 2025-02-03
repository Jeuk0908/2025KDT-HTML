package FunctionalInterface;

public class Lambda {
    public static void main(String[] args) {
        functionInterface division = (a, b) -> a / b;
        int divide = division.operate(10, 5);
        System.out.println(divide);
    }
}
