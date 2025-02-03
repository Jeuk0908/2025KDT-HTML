package w1_2_class_n_obj;

public class ClassBasic {
    //int roomNumber = 410;  //멤버변수 값 미리 지정하는 하드코딩 금지.
    int roomNumber; //클래스 내부에 생성된 인스턴스 변수(멤버변수)
    String roomName;

    static boolean hasDoor = true; //클래스 변수(정적 변수)
    //static 사용해서 선언한 정적변수(값을 정하면서 선언과 동시에 초기화)
    //이 클래스에서 사라지지않고 계속 사용 가능 (멤버, 지역 과 다르게 프로그램 실행 내내 살아있음)

    //객체 생성시 멤버변수 함께 초기화
    public ClassBasic(int roomNumber, String roomName) {//생성자는 클래스와 이름 같음
        //아무 기능 없는 기본 생성자 (객체의 초기화를 위해 사용)
        this.roomNumber = roomNumber; //roomNumber 초기화
        System.out.println(this.roomNumber + "번 강의장 객체 생성되었습니다.");

        this.roomName = roomName; //roomName 초기화
    }

    //일반 메소드
    public void printRoomName() {
        System.out.println(this.roomName);
    }

    public void printRoomNameNTimes(int n) {
        for (int i = 0; i < n; i++){
            System.out.println(this.roomName);
        }
    }

    //메소드(함수)
    public static void main(String[] args) {
        ClassBasic classBasic410 = new ClassBasic(410, "KDTroom"); //객체 생성 및 초기화
        ClassBasic classBasic411 = new ClassBasic(411, "NetworkRoom");
        ClassBasic classBasic412 = new ClassBasic(412, "CommunityRoom");

        classBasic410.printRoomName();
        classBasic411.printRoomName();
        classBasic412.printRoomName();

        System.out.println(ClassBasic.hasDoor); //정적변수로 선언했기 때문에 객체생성 없이 출력 가능.printRoomNameNTimes(int n);
    }
}
