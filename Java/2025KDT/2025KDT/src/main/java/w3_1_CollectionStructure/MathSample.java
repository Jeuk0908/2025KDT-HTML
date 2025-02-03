package w3_1_CollectionStructure;

import java.util.HashMap;
import java.util.Map;

public class MathSample {
    public static void main(String[] args) {
        //map자료형
        // Map 인터페이스에, 구현체인 hash map 객체 생성
        // (키는 문자, 값은 숫자 로 지정)
        Map<String, Integer> myIntMap= new HashMap<>();

        myIntMap.put(null, 1); // null을 키, 1 이 값. (null 은 어떤 객체든 가능하기 때문에 넣을 수 있다. 고유하기만 하면 됨)
        myIntMap.put("", 1);
        System.out.println(myIntMap);

        System.out.println(myIntMap.containsKey(null)); //null 이라는 키 있는지 확인
        System.out.println(myIntMap.containsValue(1));

        myIntMap.put("A", 1); //똑같은걸 세번 put 해도, 고유하지 않기 때문에 덮어씌워 고유성 유지 (마지막 값, 3이 저장됨)
        myIntMap.put("A", 2);
        myIntMap.put("A", 3);
        System.out.println(myIntMap);

        myIntMap.put("A", 1);
        myIntMap.put("B", 1);
        myIntMap.put("C", 1);
        myIntMap.put("D", 1);
        myIntMap.put("E", 1);
        System.out.println(myIntMap);

        System.out.println(myIntMap.keySet()); // 모든 키 만 순회하고싶을때 주로 사용
        System.out.println(myIntMap.values()); // 모든 값 만 순회하고싶을때 사용 => Iterable.(컬렉션 구조 최상위. 순회가능)
        System.out.println(myIntMap.entrySet()); // 모든 객체 set 형태로 반환. Map 전체 순회 하고싶을때 사용할 Set객체 리턴
        myIntMap.remove("E");
        System.out.println(myIntMap);
        
    }
}
