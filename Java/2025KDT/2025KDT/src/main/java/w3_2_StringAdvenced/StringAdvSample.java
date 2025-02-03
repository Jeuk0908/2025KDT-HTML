package w3_2_StringAdvenced;

public class StringAdvSample {
    public static void main(String[] args) {
        String advPractice = " 문자열 데이터를 advencedLevel 로 다뤄보고자 합니다!       \n\t";
        System.out.println(advPractice.length()); //문자열 길이 출력
        System.out.println(advPractice.substring(10, 30)); //지정한 인덱스 범위만 출력
        System.out.println(advPractice.substring(10, 24).toUpperCase());//대문자 변환 (영구적X)
        System.out.println(advPractice);
        System.out.println(advPractice.trim());//문자열 앞뒤 공백 제거
        System.out.println(advPractice.replace(" ","_"));//특정 문자열 교체


        //String 타입은 저장된 데이터에 변화가 생기면, 아예 새로운 객체로 생성함
        //이 코드처럼 내용 변경을 계속 반복하면 그만큼 메모리 낭비.
        String myStrA = "a";
        String myStrB = "b";
        for (int i = 0; i < 5; i++) {
            myStrA += myStrA;
            myStrA += myStrB;

            System.out.println(myStrA);
        }
    }
}
