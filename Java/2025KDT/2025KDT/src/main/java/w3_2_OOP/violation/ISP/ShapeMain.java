package w3_2_OOP.violation.ISP;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle myRc = new Rectangle(5, 5);
        //2D 클래스에 대해 3D 의 인터페이스가 적용되어있어서
        //아래처럼 부피계산 메소드까지 호출 가능하게 됨
        myRc.calculateArea();
    }
}
