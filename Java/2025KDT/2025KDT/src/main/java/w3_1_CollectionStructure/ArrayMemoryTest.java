package w3_1_CollectionStructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayMemoryTest {
    public static void main(String[] args) {
        int arrInitSize = 100_000_000;
        //100mb 단위가 되면 할당시간이 부담되기 시작..
        // 메모리에 올리는걸 배제하거나, 캐시 메모리처럼 미리 올려놓는다던지 다른 전략 강구
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            List<String> myList = new ArrayList<>(arrInitSize);
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Size" + arrInitSize + ", Time: " + elapsedTime + "ms");
    }
}
