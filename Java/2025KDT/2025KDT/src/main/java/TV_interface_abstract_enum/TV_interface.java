package TV_interface_abstract_enum;

public interface TV_interface {
    //상수

    //추상 메소드들
    //인터페이스에서 추상메소드 선언하고, 연결된 TV객체에서 오버라이딩
    abstract void powerToggle();

    abstract void volumeUp();

    abstract void volumeDown();

    abstract void channelUp();

    abstract void channelDown();

    abstract void brightnessUp();

    abstract void brightnessDown();

    abstract void constUp();

    abstract void constDown();

    abstract void showVideo();

    //default 메소드
    //시뮬레이터 에서 대상TV, 명령어 입력받음
    default void select() {

    }
}

