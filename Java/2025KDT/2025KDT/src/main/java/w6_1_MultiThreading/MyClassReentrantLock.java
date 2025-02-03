package w6_1_MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class MyClassReentrantLock {
    private final ReentrantLock lock1 = new ReentrantLock();
    private final ReentrantLock lock2 = new ReentrantLock();
    // 그룹 1의 임계영역 메서드에 대한 락 사용
    public void group1Method1() {
        lock1.lock();
        try {
            // 그룹 1, 메서드 1에 대한 코드
        } finally {
            lock1.unlock();
        }
    }
    // 그룹 2의 임계영역 메서드에 대한 락 사용
    public void group2Method1() {
        lock2.lock();
        try {
            // 그룹 2, 메서드 1에 대한 코드
        } finally {
            lock2.unlock();
        }
    }
}