package w3_2_StringAdvenced;

public class StringBuilderSample {
    public static void main(String[] args) {
        int length;
        
        // StringBuilder 객체생성
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("StringBuilder content: " + stringBuilder);

        // Append() : 문자열에 추가
        stringBuilder.append(" World");
        System.out.println("StringBuilder content: " + stringBuilder);

        // Insert() : 특정 위치에 문자열 추가
        stringBuilder.insert(5, " Beautiful");
        System.out.println("StringBuilder content: " + stringBuilder);
        length = stringBuilder.length();
        System.out.println("Length: " + length);

        // Delete() : 문자열 삭제
        stringBuilder.delete(4, 15);
        System.out.println("StringBuilder content: " + stringBuilder);

        // Replace() : 지정한 위치의 문자열 변경
        stringBuilder.replace(5, 10, "Java!");
        System.out.println("StringBuilder content: " + stringBuilder);

        // Reverse() : 문자열 좌우반전
        stringBuilder.reverse();
        System.out.println("StringBuilder content: " + stringBuilder);

        // Set length: Truncating or extending the sequence
        stringBuilder.setLength(7);
        System.out.println("StringBuilder content: " + stringBuilder);

        // Capacity: Obtaining the current capacity
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity: " + capacity);

        // Length: Obtaining the current length
        length = stringBuilder.length();
        System.out.println("Length: " + length);
    }
}