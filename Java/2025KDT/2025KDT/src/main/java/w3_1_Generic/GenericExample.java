package w3_1_Generic;

// (Non)Generic DTO 사용 예제
public class GenericExample {
    public static void main(String[] args) {
        // =======================================
        // 논제네릭 DTO 사용
        // =======================================
        NonGenericDTO nonGenericDTO = new NonGenericDTO();

        // Object로 데이터를 저장 (문자열)
        // Object 타입으로는 들어갔지만 String 객체의 성격 유지
        // 꺼낼때 잘 변환해서 사용
        nonGenericDTO.setObject("I'm NonGeneric!");
        
        // 데이터를 꺼낼 때 항상 형변환이 필요
        // 14행 에서 할당된 타입 확인 후 변환.
        Object object = nonGenericDTO.getObject();
        if (object instanceof String) {
            String data = (String) object;
            System.out.println(data);
        }
        String data = (String) nonGenericDTO.getObject();
        System.out.println(data); // 출력: Hello, NonGeneric!


        // 실수로 잘못된 형변환을 할 경우 런타임 에러 발생
        try {
            Integer wrongData = (Integer) nonGenericDTO.getObject(); // 런타임 오류 발생
        } catch (ClassCastException e) {
            System.out.println("ClassCastException 발생: " + e.getMessage());
        }

        // =======================================
        // 제네릭 DTO 사용
        // =======================================
        GenericDTO<String> stringDTO = new GenericDTO<>(); //GenericDTO클래스를 String 타입만 다루는 객체로 생성.

        // 컴파일 타임에 타입이 안전하게 결정됨 (문자열만 저장 가능)
        stringDTO.setObject("I'm Generic!");

        // 데이터를 꺼낼 때 형변환 불필요
        String strData = stringDTO.getObject();
        System.out.println(strData); // 출력: Hello, Generic!

        // 컴파일 타임에 잘못된 타입의 데이터 저장을 방지
        // stringDTO.setObject(12345); // 컴파일 에러 발생
        
        GenericDTO<Integer> intDTO = new GenericDTO<>();

        // 컴파일 타임에 타입이 안전하게 결정됨 (문자열만 저장 가능)
        intDTO.setObject(12345);
        //intDTO.setObject("string"); 문자열은 안들어감

        // 데이터를 꺼낼 때 형변환 불필요
//        String intData = intDTO.getObject();
//        System.out.println(intData); // 출력: 12345
    }
}