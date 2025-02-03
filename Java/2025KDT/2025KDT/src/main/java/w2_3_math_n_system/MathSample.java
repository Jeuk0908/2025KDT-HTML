package w2_3_math_n_system;

//임포트 순서 관리 밑 자동임포트 (자동 임포트가 가장 좋다)

//빌트인 라이브러리 (자바 기본내장형)
//import com.sun.security.auth.module.Krb5LoginModule;

//기타언어 유틸 라이브러리
import java.util.Scanner;

//써드파티 의존성 라이브러리 (각종 프레임워크 제공 패키지 임포트)


//사용자 지정 라이브러리

public class MathSample {
    public static void main(String[] args){

        double a = Math.ceil(5.35);
        double b = Math.floor(5.35);
        double c = Math.rint(5.35);
        double d = Math.sqrt(81);
        System.out.println("5.35 올림 : " + a);
        System.out.println("5.35 내림 : " + b);
        System.out.println("5.35 반올림 : " + c);
        System.out.println("81 제곱근 : " + d);

    }
}
