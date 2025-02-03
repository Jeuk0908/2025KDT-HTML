package w1_3_simpleinherit;

//extends 를 사용해 Parent 의 모든것을 상속받음
public class Child extends Parent {
    @Override //오버라이드 애너테이션을 쓰면, 내가 작성한 메소드가 상위 클래스의 메소드와 일치하는지 확인, 에러방지
    @SuppressWarnings("deprecation")
    //Parent 의 hello 생성자 그대로 가져옴
    public void hello(String target) {
        if (target==null || target.isEmpty()) {
            super.hello(target);//super키워드로 Parent의 hello 인것을 가리킴
        } else {
            System.out.println("hello "+target+" from child!");
        }
    }
}