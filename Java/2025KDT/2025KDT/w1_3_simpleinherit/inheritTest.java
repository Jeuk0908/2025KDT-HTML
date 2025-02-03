package w1_3_simpleinherit;

public class inheritTest {
    public static void main(String[] args) {
        //Parent 클래스
        Parent parentA = new Parent();
        parentA.hello("world");

        //Child 클래스
        Child childA = new Child();
        childA.hello("world");
    }
}
