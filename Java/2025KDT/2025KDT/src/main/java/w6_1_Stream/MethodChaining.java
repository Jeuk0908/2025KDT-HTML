package w6_1_Stream;


public class MethodChaining {
    private int age;
    private String name;

    @Override
    public String toString(){
        return "MethodChaining [age=" + age + ", name=" + name + "]";
    }

    public MethodChaining(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //Setter 에서 객체 스스로를 반환
    public MethodChaining setAge(int Age){
        this.age = Age;
        return this;
    }
    public MethodChaining setName(String name) {
        this.name = name;
        return this;
    }

    public static void main(String[] args) {
        MethodChaining methodChaining = new MethodChaining(10, "John");
        //setAge() 와 setName() 을 한줄에서 호출 (메소드체이닝)
        methodChaining.setAge(20).setName("Kyle");

        System.out.println("hi" + methodChaining);
    }
}
