package w3_4_NestedClassSample;

class Button {
    //범용 객체에 개해서 동적으로 함수 할당받을 수 있게끔 인터페이스 사용
    // => Collection 안에서 forEach() 메소드가 Cunsumer인터페이스 사용하는 구조와 유사
    // => 특정 개념 하에서만 독점 사용되는 인터페이스의 경우 중첩으로 선언!
    interface OnClickListener {  // 함수형 인터페이스
        void onClick();
    }
    // 1.OnclickListener 인터페이스를 변수로 지정하고
    private OnClickListener listener;

    //생성자
    //동작까지 지정 해달라는 식으로 선언 가능
    public void setOnClickListener(OnClickListener listener) {
        // 2.그 변수를 메소드로 넣어서 동작 지정도 가능하게.
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}



public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(() -> System.out.println("Button clicked!"));
        button.click(); // 출력: Button clicked!
    }
}