package TV_interface_abstract_enum;

import java.util.Scanner;

public class mainSimulator{
    public static void main(String[] args) {

        // 1. 시뮬레이션에 필요한 객체 명세 생성
        // 리모컨 = TVRC
        TV_remoteController TVRC = new TV_remoteController();
        TV_interface tv1 = new TV();
        TV_interface tv2 = new TV_satellite();
        TV normalTV = new TV();
        TV_satellite satelliteTV = new TV_satellite();

        // 2. 사용자 input 커맨드 안내 출력
        System.out.println("""
            ======= 리모콘 버튼 명세 =======
            예시) tv1_pow
            전원             =  pow
            채널 올리기        =  chUp
            CH_DOWN         =  chDn
            VOLUME_UP       =  volUp
            VOLUME_DOWN     =  volDn
            BRIGHTNESS_UP   =  brightUp
            BRIGHTNESS_DOWN =  brightDn
            CONTRAST_UP     =  constUp
            CONTRAST_DOWN   =  constDn
            
            ===========TV 선택===========
            일반 TV = tv1
            위성 TV = tv2
            ======= 시뮬레이션 종료 ========
                        exit
            ============================
        """);

        Scanner myScanner = new Scanner(System.in);
        // 3. 본격적인 시뮬레이터 동작 시작
        while(true) {
            System.out.println("버튼을 누르세요");
            System.out.println();
            String consoleInput = myScanner.nextLine();

            //tv번호와 명령어 구분 ex)"tv1_pow"
            String TVid = consoleInput.split("_")[0];
            String tvCmd = consoleInput.split("_")[1];
//            String show = "show";

//            TVRC.btnPress(tv1, show);
//            TVRC.btnPress(tv2, show);

            if (consoleInput.equals("exit")) {
                System.out.println("시뮬레이션 종료.");
                return;
            }

            //버튼 누른 신호 인터페이스로 보내기 (대상 TV, 사용자 입력)
            if (TVid.equals("tv1")) {
                TVRC.btnPress(tv1, TV_remoteController.TVButtons.valueOf(tvCmd));
            } else if (TVid.equals("tv2")) {
                TVRC.btnPress(tv2, TV_remoteController.TVButtons.valueOf(tvCmd));
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
