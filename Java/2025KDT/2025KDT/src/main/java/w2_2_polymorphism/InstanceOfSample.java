package w2_2_polymorphism;

public class InstanceOfSample {
    public static void main(String[] args) {
        Shape myShape1 = new Circle();
        Shape myShape2 = new Square();

        Shape[] shapes = { myShape1, myShape2 };
//        if (myShape1 instanceof Shape) {
//            System.out.println("Shape 입니다!");
//        }
//
//        if (myShape2 instanceof Circle) {
//            System.out.println("Circle 입니다!");
//        } else if (myShape2 instanceof Shape) {
//            System.out.println("Shape 입니다!2");
//        }
//
//        if (myShape3 instanceof Circle) {
//            System.out.println("Circle 입니다!");
//        } else if (myShape3 instanceof Square) {
//            System.out.println("Square 입니다!");
//        } else if (myShape3 instanceof Shape) {
//            System.out.println("Shape 입니다!2");
//        }

        for (Shape anyShape: shapes){
            if (anyShape instanceof Circle myCircleShape) {
                System.out.println("Circle 입니다!");
//            Circle myCircleShape3 = (Circle)myShape3;
                myCircleShape.draw();
            } else if (anyShape instanceof Square mySquareShape) {
                System.out.println("Square 입니다!");
                mySquareShape.draw();
            }
        }
    }
}
