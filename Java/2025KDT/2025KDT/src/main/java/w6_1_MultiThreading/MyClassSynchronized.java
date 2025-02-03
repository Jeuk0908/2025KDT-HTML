package w6_1_MultiThreading;

public class MyClassSynchronized {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void group1Method1() {
        synchronized (lock1) {
            // 그룹 1, 메서드 1에 대한 코드
        }
    }
    public void group1Method2() {
        synchronized (lock1) {
            // 그룹 1, 메서드 2에 대한 코드
        }
    }
    public void group2Method1() {
        synchronized (lock2) {
            // 그룹 2, 메서드 1에 대한 코드
        }
    }
    public void group2Method2() {
        synchronized (lock2) {
            // 그룹 2, 메서드 2에 대한 코드
        }
    }
}