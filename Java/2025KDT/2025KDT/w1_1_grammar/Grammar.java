package w1_1_grammar; //패키지 선언 부터 시작

/**
 * 협업하는 개발자들을 위한 궁시렁궁시렁
 * 작성한 프로그램 요소별로
 * 이렇게 친절한 Docs 생성용 주석 작성할수 있다.
 * => Class 에 대한 Docs 생성함 (커서를 class 위에 올리면 Docs 내용 나옴)
 */

public class Grammar {
    //한줄 주석 : 주석도 코드디.
    /*
      여러줄 주석
     */
    static int classVar = 10; //클래스 블록 에서 선언하면 정적 변수 혹은 클래스변수
    /**
     * 메소드 Docs 에 대해서는
     * 작성 위한 포맷이 따로 존재한다.
     * 그게바로 API 문서 작성 및 자동생성에 필요한 기본 포맷이 된다.
     * @param args
     * =>외부에서 문자열 입력 수신하는 파라미터.
     */
    public static void main(String[] args) {
        int mynum1 = 1; //세미콜론으로 줄 마침
        int mynum2 = 2;

        { //블록.
            int localNum1 = 1;
        }
        //int localNum2 = localNum1 + mynum2; //localNum1 이 블록 안에 있기 때문에 지역변수로 작용
    }
    // 공백
    //탭, 스페이스, 엔터
    //공백처리를 위한 '제어문자'. (ex. \n,\r:개행(os를 따름), \t:탭, &nbsp; : 공백)


    //식별자
    //메소드, 클래스, 변수같이 식별 하기위해 사용자가 지정한 이름
    //식별자는 개발자들간의 규칙이 존재(노션 문서 확인)

    //구분자
    //공백문자, 행 구분자, 컴마, 세미콜론, 괄호 등등

}
