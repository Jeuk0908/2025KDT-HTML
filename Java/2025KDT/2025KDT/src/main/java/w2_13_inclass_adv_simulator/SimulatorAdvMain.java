package w2_13_inclass_adv_simulator;

import java.util.Scanner;

public class SimulatorAdvMain {
    public static void main(String[] args) {
        // 1. 시뮬레이션 필요 객체 생성
        // 1-1. 제어 주체 및 대상 디바이스 객체
        SatelliteTV mySatelliteTV = new SatelliteTV(
            11, 10, "Sky Life"
        );
        InternetTV myInternetTV = new InternetTV(
            150, 10, "KT Giga Internet"
        );
        Aircon myAircon = new Aircon(5, 20);
        MultiDeviceRC myMultiRC = new MultiDeviceRC();
        // 1-2. 시뮬레이션 진행용 객체
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            // 2. 사용자 input 안내 및 수신
            // 2-1. 인풋 안내
            System.out.println("""
                ============ 디바이스 선택 안내 ============
                위성 TV: stv | 인터넷 TV: itv | 에어컨: air
                ============= 리모콘 버튼 안내 =============
                TV 버튼: pow, chUp, chDn, volUp, volDn
                AC 버튼: pow, windUp, windDn, tmpUp, tmpDn
                ============== 시뮬레이션 종료 =============
                "exit" 입력
                ========================================
            """);
            // 2-2. 인풋 수신
            System.out.println("리모콘 버튼을 누르세요:");
            String consoleInput = myScanner.nextLine();

            // 3. 종료 조건 판단 (exit)
            if (consoleInput.equals("exit")) {
                System.out.println("시뮬레이션을 종료합니다.");
                return;
            }

            // 4. 리모컨 입력에 대한 동작 수행
            // 4-1. 대상 디바이스 판단 (입력값 파싱)
            // ex) stv_pow, ~~~, itv_volDn,
            //     air_windUp, ~~~, air_tmpDn
            String devChoice = consoleInput.split("_")[0];
            String actionCmd = consoleInput.split("_")[1];
            //  => 아무거나 입력 시 파싱 실패
            // =======================================
            // <예외 처리 전략 3가지 연습활동>
            // 1) 메인 함수에 직접 작성된 디바이스 판단 구문을 별도 메서드로 분리
            // 2) 분리된 메서드에서 예외 전환 수행 -> 예외 회피
            // 3) main 메서드에서 분리된 디바이스 판단 메서드를 호출하면서 전환된 예외를 복구
            // =======================================
            // 4-2. 해당 디바이스 호출
            if (devChoice.equals("stv")) {
                myMultiRC.btnPress(
                    mySatelliteTV,
                    MultiDeviceRC.TVButton.fromCommand(actionCmd) // TV enum 버튼 전달
                );
            } else if (devChoice.equals("itv")) {
                myMultiRC.btnPress(
                    myInternetTV,
                    MultiDeviceRC.TVButton.fromCommand(actionCmd) // TV enum 버튼 전달
                );
            } else if (devChoice.equals("air")) {
                myMultiRC.btnPress(
                    myAircon,
                    MultiDeviceRC.ACButton.fromCommand(actionCmd) // AC enum 버튼 전달
                );
            } else {
                System.out.println(
                    "디바이스 선택이 잘못되었습니다:" + consoleInput
                );
            }
            // 5. 켜져있는 디바이스 전체 실행
            mySatelliteTV.showVideo();
            myInternetTV.showVideo();
            myAircon.blowWind();

            // 6. (1초 슬립) 필요 시
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
