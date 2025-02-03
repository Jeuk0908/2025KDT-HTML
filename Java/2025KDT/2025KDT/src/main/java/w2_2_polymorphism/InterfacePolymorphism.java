package w2_2_polymorphism;

//인터페이스 생성
interface Shape { //"도형" 을 작업의 주체로 보고, 기능구현 할 때 개발자들간의 한 단위로 두고싶은 경우 이렇게 선언
    void draw();
}

//Shape
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class InterfacePolymorphism {
    public static void drawShape(Shape shape)// 메소드의 매개변수로 인터페이스를 사용하면 객체상관없이 유연한 동작 가능
    {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();


        drawShape(shape1);
        drawShape(shape2);
    }
}