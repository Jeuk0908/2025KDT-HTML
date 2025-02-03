package w1_2_class_n_obj;

public class OverloadingDog {
    public static boolean fourLegs = true;

    // 멤버 변수
    public String name;
    public int age;
    public int furLength;

    // 생성자1
    public OverloadingDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 생성자2 : 털 길이까지 포함된 생성자 오버로딩 (good)
    public OverloadingDog(String name, int age, int furLength) {
        this.name = name;
        this.age = age;
        this.furLength = furLength;
    }

    // 생성자3 : 생성자 오버로딩 (bad)
    //1. 시그니처 사용 순서의 일관성 해침
    //2. 기존 생성자의 시그니처 용도가 바뀐게 없음
    //3. 기존 생성자에 추가된 파라미터가 없음
    public OverloadingDog(int furLength, String name, int age) {
        this.furLength = furLength;
        this.name = name;
        this.age = age;
    }

    // bark 메소드
    public void bark() {
        System.out.println("Woof! My name is " + name + " and I'm " + age + " years old.");
    }
    //bark 메소드 과적합
    //시그니처(매개변수)를 다르게 해서 오버로딩
    public void bark(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "(" + i + ") Woof! My name is " + name
                            + " and I'm " + age + " years old."
            );
        }
    }

    public static void main(String[] args) {
        // 객체 생성
        OverloadingDog myDog1 = new OverloadingDog("Buddy1", 1);
        OverloadingDog myDog2 = new OverloadingDog("Buddy2", 2, 10);
        OverloadingDog myDog3 = new OverloadingDog(5, "Buddy3", 3); //안좋은 오버로딩

        // 객체 메서드 호출
        myDog1.bark();
        myDog2.bark(2);
        myDog3.bark(3);
    }
}
