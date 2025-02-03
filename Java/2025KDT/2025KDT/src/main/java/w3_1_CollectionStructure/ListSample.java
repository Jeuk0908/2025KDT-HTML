package w3_1_CollectionStructure;

import w2_1_accessmodifier.a.A;

import java.util.List; //List 는 인터페이스
import java.util.LinkedList; //AbstractList 를 확장
import java.util.ArrayList; //AbstractList 를 확장

public class ListSample {
    public static void main(String[] args) {
        //ArrayList
        //LinkedList
        //List

        // 너무 광범위한 타입 선언. 권장X
        List<Object> myList1 = new ArrayList<>();
        List<Object> myList2 = new ArrayList<>();

        //변수에 제네릭 타입 선언시, 생성문에는 그에 맞는 타입 들어가는게 상식. (자동으로 타입 추론, 생략가능)
        List<Integer> myStrArrList = new ArrayList<Integer>(6); //10은 메모리 공간 제한. 10개 데이터 저장가능.


        List<String> myStrLnkList = new LinkedList<>();


        System.out.println(myStrArrList);


    }
}
