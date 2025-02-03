package w3_2_OOP.violation.ISP;

public interface Shape { //Interface 의 SRP = ISP 위반
    double calculateArea();
    double calculateVolume();
}



class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculateVolume() {
        throw new UnsupportedOperationException("사각형은 부피 계산이 불가능합니다!");
    }
}

class Cube implements Shape {
    private double width;
    private double height;
    private double depth;

    public double calculateArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    public double calculateVolume() {
        return width * height * depth;
    }
}