package AdvencedSimulator;
import java.util.Scanner;

public class mainSimulator {
    public static void main(String[] args) {

        // 1. 시뮬레이션에 필요한 객체 명세 생성
        // 리모컨 = TVRC
        // TV생성자 의 파라미터 = myTV
        TV_remoteController TVRC = new TV_remoteController();
        TV myTV = new TV(10, 45, 50, 50);

        // 2. 사용자 input 커맨드 안내 출력
        System.out.println("""
            ======= 리모콘 버튼 명세 =======
            POWER           =  pow
            CH_UP           =  ch_up
            CH_DOWN         =  ch_down
            VOLUME_UP       =  vol_up
            VOLUME_DOWN     =  vol_dn
            BRIGHTNESS_UP   =  bright_up
            BRIGHTNESS_DOWN =  bright_dn
            CONTRAST_UP     =  const_up
            CONTRAST_DOWN   =  const_dn
            ============================
            ======= 시뮬레이션 종료 ========
                        exit
            ============================
        """);

        Scanner myScanner = new Scanner(System.in);
        // 3. 본격적인 시뮬레이터 동작 시작
        while(true) {
            System.out.println("버튼을 누르세요");
            String consoleInput = myScanner.nextLine();

            if (consoleInput.equals("exit")) {
                System.out.println("시뮬레이션 종료.");
                return;
            }

            //버튼 누른 신호 보내기 (대상 TV, 사용자 입력)
            TVRC.btnPress(myTV, consoleInput);

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
