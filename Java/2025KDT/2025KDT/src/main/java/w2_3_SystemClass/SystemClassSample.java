package w2_3_SystemClass;

public class SystemClassSample {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        System.out.println("현재 시간(밀리초): " + currentTime);

        //환경변수 가져오기
        String userName = System.getenv("USER");
        System.out.println("사용자 이름: " + userName);

        //배열 요소 복사
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[5];
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

    }
}
