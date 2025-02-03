package w3_2_GarbageCollector;

import java.lang.ref.Cleaner;
import java.nio.ByteBuffer;

public class OffHeapMemoryExample {
    static Cleaner cleaner = Cleaner.create();

    public static void main(String[] args) {
        // Off-Heap 메모리 크기 설정 (예: 1 메가바이트)
        int offHeapMemorySize = 1000 * 1000; //mib 말고 mb 단위로

        // Direct ByteBuffer를 사용하여 Off-Heap 메모리 할당
        // offHeapBuffer 객체가 GC의 대상이 안됨.
        // GC의 대상이 되게끔 등록하면 되는건X, offHeapBuffer변수 자체가 참조 끊어져야 수거됨.
        // 그래서 offHeapBuffer에 null 넣음 (39번 행) => 강한참조 해제
        ByteBuffer offHeapBuffer = ByteBuffer.allocateDirect(offHeapMemorySize);

        // Off-Heap 메모리에 데이터 쓰기
        // heap메모리에서 문자열과 배열 핸들링
        String data = "Hello Off-Heap!";
        byte[] bytes = data.getBytes();
        // 문자열에 해당하는 이진 데이터 off-Heap 에 저장.
        offHeapBuffer.put(bytes);
        // 읽기 모드로 변경
        offHeapBuffer.flip();

        // Off-Heap 메모리에서 데이터 읽기
        // 빈 heap 메모리 이진데이터 미리 준비하고
        byte[] readBytes = new byte[bytes.length];

        // off-Heap 에 있는 데이터를 준비한 heap 영역으로 복사
        offHeapBuffer.get(readBytes);


        String readData = new String(readBytes);
        System.out.println("Read from Off-Heap Memory: " + readData);

        // Off-Heap Buffer를 Cleaner를 사용하여 해제
        cleanDirectBuffer(offHeapBuffer);
        offHeapBuffer = null; //강한 참조 해제
        System.gc();

        for (int i = 0; i <10; i++){ //5. 수거되는 동작을 sleep 으로 대기
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    // Direct ByteBuffer를 Cleaner를 사용하여 해제하는 메서드
    private static void cleanDirectBuffer(ByteBuffer buffer) {
        if (buffer.isDirect()) {
            cleaner.register(buffer, () -> {
                // Off-Heap Buffer가 해제될 때 수행할 작업 정의
                System.out.println("Cleaning Direct Buffer");
            });
        }
    }
}