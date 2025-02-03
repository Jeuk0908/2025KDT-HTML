package w6_1_MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

//동시성 제어 성공 예제
public class ConcurrencyBasicSolutionSample2 {
    private int passCount = 0;

    public static void main(String[] args) {
        ConcurrencyBasicSolutionSample2 example = new ConcurrencyBasicSolutionSample2();
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(() -> example.process());
            thread.start();
        }
    }

    // 메서드에 synchronized 키워드를 사용해 스레드 동기화
		private synchronized void process() {
        //스레드 "하나씩만" 진입 가능하도록 lock 적용됨
        if (passCount < 10) {
            try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("passCount: " + (++passCount));
        } else {
            System.err.println("blocked by passCount condition");
        }
    }
}