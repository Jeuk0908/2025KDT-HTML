package w2_2_polymorphism;

class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class TypeCastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        if (vehicle instanceof Car) { //instanceof 로 객체의 타입 알 수 있음
            Car car = (Car) vehicle; // 명시적 변환
            car.playMusic();
        }
    }
}
