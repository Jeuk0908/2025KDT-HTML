package w6_1_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static List<String> sampleList = Arrays.asList("apple", "apple", "orange", "banana", "kiwi", "watermelon");


    public static void main(String[] args) {
                //stream 선언
        sampleList.stream()
                //중개연산 filter (a로 시작하는 요소 걸러내기)
                //stream 출력은 stream 타입으로, 이렇게 메소드체이닝도 가능
                .filter(sampleList -> sampleList.startsWith("a"))
                .filter(sampleList -> sampleList.endsWith("e"))
                //종단연산 forEach (a로 시작하는 요소 출력)
                //요소 하나하나씩 출력 하는 문법
                .forEach(System.out::println);

                //요소들을 하나의 문자열로 출력
        String result1 = sampleList.stream()
                .reduce(" ", (a, b) -> a + b);
        System.out.println(result1);

                //중복된 요소 제거후 출력
        sampleList.stream()
                .distinct()
                .forEach(System.out::println);

        //멀티스레딩 방식
        sampleList.parallelStream().forEach(System.out::println);

        List<String> names = Arrays.asList("John", "Jane", "Doe", "Alice");
        List<String> result2 = names.stream()
                //디버깅 위해 결과확인용으로 쓰는 peek()
                .peek(System.out::println)
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());
    }


}
