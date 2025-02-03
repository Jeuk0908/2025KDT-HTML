package w2_2_Sealed_n_final;

//인터페이스 생성
//sealed 로 봉인
sealed class Shape permits Circle,Square { //"도형" 을 작업의 주체로 보고, 기능구현 할 때 개발자들간의 한 단위로 두고싶은 경우 이렇게 선언
    void draw(){
        System.out.println("drawing Default");
    }
}

//Shape
//원래는 상속 안되는데, permits 랑 final 키워드로 허가내줌
final class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

////위에서 한번 허락해줘서 이후로는 상속 불가.
//final class ChildCircle extends Circle {
//    @Override
//    public void draw() {
//        System.out.println("Drawing Circle");
//    }
//}


//non-sealed 클랙스는 위의 sealed 제어로부터 봉인해제 시켜줌
non-sealed class Square extends Shape {
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