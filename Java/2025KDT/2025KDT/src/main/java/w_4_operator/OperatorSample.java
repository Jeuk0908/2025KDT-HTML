package w_4_operator;

public class OperatorSample {
    public static void main(String[] args) {

        //단항 연산자
        int values = (int) Long.MAX_VALUE; //int => long
        System.out.println(values);

        long longValue = (long) Integer.MAX_VALUE; //long => int
        System.out.println(longValue);

        byte original = 0b00000011; //10진수 3
        byte fliped = (byte) ~original; //int로 들어가서 byte로 변환
        System.out.println(fliped);

        //2항 연산자
        int volume = 10;
        int bright = 50;

        int vol = volume + bright;
        System.out.println(vol);

        int a = 10;
        short b = 20;
        System.out.println(a + b);
        short c = (short)(a + b);
        //작다 크다의 기준 : 특정 데이터 타입으로 표현 가능한 값의 범위
        float d = 10.5f;
        //int f = d + b; //값이 실수가 나오는데, 정수형으로 선언해서 에러.

        String name = "John";
        String surname = "Doe";
        String fullName = name + " " + surname;
        System.out.println(fullName);

        Boolean powerOn = true;
        // !powerOn; //이건 문 이 아니라 식으로 작용 (!powerOn 은 powerOn != true 와 같다)
        //문(Statement), 식(Expression)
        //식 은 값을 제공.

        //논리연산 Bool 대수
        boolean result1 = true & false; //논리 곱. false 로 출력 ex) (1 * 0 = 0 false)
        boolean result2 = true | false; //논리 합. true 로 출력 ex) (1 + 0 = 1 true)


        //3항 연산자
        int bbb = 1000;
        int sss = 10;
        if (bbb > sss) {
            System.out.println(bbb);
        } else {
            System.out.println(sss);
        }

        //위의 if문을 3항연산자로 축약.
        int max = (bbb > sss) ? bbb : sss; //bbb가 더 크면 bbb를 max 에 대입
        System.out.println(max);
    }
}
