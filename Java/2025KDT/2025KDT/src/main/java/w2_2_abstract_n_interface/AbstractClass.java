package w2_2_abstract_n_interface;

abstract public class AbstractClass implements InterfaceSample, InterfaceSample2{
    //abstract(추상클래스) 는 객체화 불가능!! (7번 줄)

    //동작 구현 안된 메소드는 등록가능
    abstract void absMethodInAbsCls();
    //개발자간 의사소통이나 협업용도X
    //인터페이스가 아니라 개념의 계층화 용도

    void absMethodInAbsCls(int a) {
        System.out.println("객체화는 할 수 없지만 구체화된 클래스 에서"+"동작할 내용을 디폴트 메소드로 미리 등록 가능");
    }

    public static void main(String[] args) {
//        AbstractClass myAbs = new AbstractClass(); 객체화 불가능!!
    }
}
