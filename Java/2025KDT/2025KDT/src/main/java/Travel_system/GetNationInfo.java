package Travel_system;

//여행관리국, 이민청 클래스의 정보 가져오는 작업 위한 인터페이스
public interface GetNationInfo {

    abstract int getNationNum(String name);
    abstract boolean getWarInfo(int nationID);
    abstract int getNationCredit(int nationID);
    abstract int getNationCautionRate(int nationID);
}
