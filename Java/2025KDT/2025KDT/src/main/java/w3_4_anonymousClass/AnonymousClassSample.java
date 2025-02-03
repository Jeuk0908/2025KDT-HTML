package w3_4_anonymousClass;

//익명객체 코드
public class AnonymousClassSample {
    public static void main(String[] args) {

        Duck duck = new Duck() {
            @Override
            public void quack(){
                System.out.println("QQQQQQUUUUAAAACCCKKK!!!!!!!!!!!!!!");
            }
        };
        duck.quack();
    }
}