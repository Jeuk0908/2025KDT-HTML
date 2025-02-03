package w3_2_OOP.violation.SRP;

// SRP 원칙을 위반한 User 클래스 선언
public class User {
    private String username;
    private String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean isValid() { //사용자가 본인 계정의 유효성을 판단하진 않는다 (SRP위반)
        // 유효성 검사
        return true;
    }
    
    public void save() {
        // 데이터 저장
    }
}