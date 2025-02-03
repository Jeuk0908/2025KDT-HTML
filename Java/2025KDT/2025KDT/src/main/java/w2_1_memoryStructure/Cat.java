package w2_1_memoryStructure;

public class Cat {

    // 생성자
    public Cat(int age, float furLength, String name) {
        this.age = age;
        this.furLength = furLength;
        this.name = name;
    }

    // Static 변수 (변하지않는 것)
    public static final boolean fourLegged = true; //다리 4개
    public static final boolean mammal = true;

    // 인스턴스 변수
    public int age;
    public float furLength;
    public String name;

    // 인스턴스 메서드
    public int getAge() {
        return this.age;
    }

    public float getFurLength() {
        return furLength;
    }

    public String getName() {
        return name;
    }

    // Static 메서드 (main함수니깐 stack영역에 쌓임)
    public static void main (String[]args){
        // 1.Cat 객체 생성 (main 에서 생성 => heap 영역)
        Cat myScottishFold = new Cat(1, 10.123f, "Scattish");
        // 2.연산 위한 변수분리 (참조자료형만 heap 영역에 저장)
        // int, float 은 기본 자료형. stack 영역에 위치하게된다.
        int catAge = myScottishFold.getAge();
        float catFurLength = myScottishFold.getFurLength();
        String catName = myScottishFold.getName();
    }
}