package w2_2_1_stringclasspractice;

import java.util.Arrays;
import java.util.List;

public class StringHashAndAddress {
    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList(  //배열 리스트 생성
                "AAAAAAA",
                "BBBBBBB",
                "CCCCCCCCCCCCCC", //세번째, 네번째 문자열 같은 객체 이고
                "CCCCCCCCCCCCCC",
                new String("CCCCCCCCCCCCCC") //new 로 생성한 문자열이라서 다른 객체
        );
        for (String a: testStrings) {
            System.out.println(a.hashCode()); //그냥 hashCode(). 다른 객체지만 헤시 코드는 같다.
        }
        System.out.println("----------------------------------");
        for (String a: testStrings) {
            System.out.println(System.identityHashCode(a)); //identityHashCode() 사용해야 주소 고유값 출력
        }
    }
}
