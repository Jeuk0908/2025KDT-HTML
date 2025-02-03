//package w3_1_CollectionStructure;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Random;
//import java.util.List;
//
//public class LottoSimpleList {
//
//    private static int getLottoNum() {
//        Random myRandom = new Random();
//        int LottoNum = myRandom.nextInt(45) + 1;
//        return LottoNum;
//    }
//
//    public static void main(String[] args) {
//        // 1. 숫자 범위 1~45 랜덤 추출기 생성
//        getLottoNum();
//        // 추출기 자체에서 중복번호 나올 수 없게 처리해도 됨
//
//        // 2. 6개의 숫자를 당첨번호로 저장할 수 있는 List<Integer> 생성
//        List<Integer> winNumbers = new ArrayList<Integer>(6);
//        do {
//            int pickedNum;
//            while (winNumbers.size() < 6) {
//                pickedNum = getLottoNum();
//                if (!winNumbers.contains(pickedNum)) {
//                    winNumbers.add(getLottoNum());
//                }
//            }
//
//
//            // 중복 번호가 나올 경우 Pass 할 수 있는 로직 구현
//
//            // 3. 6개의 숫자를 복권번호로 저장할 수 있는 List<Integer> 생성
//            // 중복 번호가 나올 경우 Pass 할 수 있는 로직 구현
//            List<Integer> tryNumbers = new ArrayList<>(6);
//
//            int tryNum;
//            while (tryNumbers.size() < 6) {
//                tryNum = getLottoNum();
//                if (!tryNumbers.contains(tryNum)) {
//                    tryNumbers.add(getLottoNum());
//                }
//            }
//
//            System.out.println("tryNumbers: " + tryNumbers);
//
//            // 4. 당첨번호와 복권번호를 비교할 수 있는 비교 메서드 구현
//            // List 에서 순서가 달라도 비교할 수 있게 로직 구현
//            Collections.sort(tryNumbers);
//            Collections.sort(winNumbers);
//            if (winNumbers.equals(tryNumbers)) {
//                System.out.println("당첨!!");
//            } else {
//                System.out.println("꽝");
//            }
//
//            // 5. 결과 출력 (당첨번호 / 복권번호 / 당첨여부)
//        }
//
//
//        // 6. 당첨 될 때까지 뽑는 반복문 작성 (3~5번 수정)
//        //    당첨 시에만 결과 출력하고, 출력문에 반복 횟수를 함께 출력
//        int tryCount = 0;
//    }
//}
