package w2_4_overUnderFlow;

public class OverUnderflowSample {
    public static void main(String[] args) {
        //오버플로우
        //int의 최대값에 +1. 최대치 값에서 최소치 값으로 바뀌어버림
        int max = Integer.MAX_VALUE;
        int overFlow = max + 1;
        System.out.println(max);
        System.out.println(overFlow);

        //오버플로우
        //int의 최소값에 -1. 최소치 값에서 최대치 값으로 바뀌어버림
        //이건 언더플로우 아님. 이것도 결국 표현 가능한 최대치를 초과한 것이기 때문
        int min = Integer.MIN_VALUE;
        int overflow2 = min - 1;
        System.out.println(min);
        System.out.println(overflow2);

        //언더플로우
        //float underFlow = 1.4e - 45f; //float의 최소 양수 값
        //float result = underFlow / 10; // 불가능한 값
        //System.out.println(underFlow);


        float a = 0.1f;
        float b = 0.2f;
    }
}
