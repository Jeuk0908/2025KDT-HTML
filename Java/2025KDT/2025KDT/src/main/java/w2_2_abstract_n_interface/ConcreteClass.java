package w2_2_abstract_n_interface;

public class ConcreteClass extends AbstractClass
        implements InterfaceSample, InterfaceSample2{ //부모 클래스 상속받음과 동시에 인터페이스 구현 가능

    //메소드 전부 다 구체화(구현) 해야함
    @Override
    void absMethodInAbsCls() {

    }

    @Override
    public void absMethod() {

    }

    @Override
    public void absMethod(int a) {

    }

    @Override
    public void absMethod(int a, int b) {

    }

    @Override
    public void absMethod(int[] arrA) {

    }

    @Override
    public void absMethod2() {

    } //추상클래스 상속
}
