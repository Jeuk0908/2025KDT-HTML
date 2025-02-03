package w2_4_encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        //객체생성
        BankAccount myBankAccount = new BankAccount(1000);
        Person myChild = new Person("John", 25);

        //대규모 프로젝트처럼 여러 기능 함께 개발될때,
        //접근제어자 적절히 사용하면
        //아래처럼 개발자의 부정연산 방지할수 있다.

        //계좌 잔고를 1000을 곱해버림 (balance 가 private 이라서 에러
        //myBankAccount.balance *= 1000;
        //System.out.println(myBankAccount.balance);

        //잔고 추가, 잔고확인은 메소드를 통해 가능
        //이건 캡슐화 되었다고 할 수 있다.
        myBankAccount.deposit(1000);
        System.out.println(myBankAccount.getBalance());

        myChild.setName("Kyle");
        System.out.println(myChild.getName());
        myChild.setAge(34);
        System.out.println(myChild.getAge());
        //Getter, Settet 통해서 기본연산 사용하는건 대부분 허용
        myChild.addAge(); //함수로 항상 한살씩 증가하는걸 강제하는 기능도 가능
    }
}
