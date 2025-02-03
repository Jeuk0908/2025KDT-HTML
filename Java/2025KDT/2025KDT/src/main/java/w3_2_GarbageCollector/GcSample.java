package w3_2_GarbageCollector;

import java.lang.ref.WeakReference;

//GC 가 객체 제거하는 메커니즘
public class GcSample {
    public static void main(String[] args) {
        ResourceHolder obj = new ResourceHolder(1); //1.기본(강한) 참조 로 객체생성
        WeakReference<ResourceHolder> weakRef = new WeakReference<>(obj); //2. 약한 참조로 obj 객체 연결
        obj = null; //3. obj를 null로 설정하여 참조 해제
        System.out.println(weakRef.get());
        System.gc(); //4. 생성되었던 heap 에 있는 객체를 GC 호출로 제거


        for (int i = 0; i <10; i++){ //5. 수거되는 동작을 sleep 으로 대기
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(weakRef.get());
    }
}
