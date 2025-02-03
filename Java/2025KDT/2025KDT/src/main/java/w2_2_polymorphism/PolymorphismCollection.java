package w2_2_polymorphism;

import java.util.ArrayList;
import java.util.List;

abstract class Animal { //"동물" 이라는 하나의 큰 개념이기때문에 추상클래스가 적합
    public void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class PolymorphismCollection {
    public static void main(String[] args) {

        //Animal 만 담을 수 있는 리스트 (단일 타입만 핸들링 하는 Collection)
        //동일한 개념을 계층화 시켜 통합관리가 쉬움
        //List : 유틸 클래스의 인터페이스.(순서를 유지시켜줌)
        //<Animal> : List에 넣을 객체의 타입.
        //animals : 이름
        //ArrayList<>() : 실제 데이터가 저장되는 구현체
        List<Animal> animals = new ArrayList<>(); //개와 고양이 둘다 Animal 이기때문에 넣을 수 있다.

        //개와 고양이. 둘다 Animal 이라는 개념으로 통일된다.(Animal 추상 클래스)
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
