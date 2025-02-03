package w2_1_shallow_n_deep;

public class CopyTypeSample {
    public static void main(String[] args) {
        // 1.참조 자료형(heap) 인 배열 객체 생성
        int[] a = {1, 2, 3, 4, 5};

        // 2. 1번의 참조자료형 배열을 할당연산자로 다른 변수에 할당
        int[] b = a;

        // 3.DeepCopy 수행하는 메소드를 명시적으로 사용, 새 변수에 할당
        int[] c = a.clone();

        a[4] = 99;  // {1, 2, 3, 4, 99};
        System.out.printf("5th int in b is : %d \n" ,b[4]); //a 를 수정했는데 b도 수정됨
        System.out.printf("5th int in c is : %d" ,c[4]); //c 는 그대로
    }
}