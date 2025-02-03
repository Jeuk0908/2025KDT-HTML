package MultiDeviceControll;

import java.util.Scanner;

public class SimulatorMain {
    String TVid;
    String tvCmd;

    public SimulatorMain(String TVid, String tvCmd) {
        this.TVid = TVid;
        this.tvCmd = tvCmd;
    }

    //시뮬레이션 할 객체 생성
    static TVinterface myCableTv = new CableTV(10, 45, 50, 50);
    //InternetTV myInternetTv = new InternetTV(채널, 볼륨, 밝기, 대비 값);
    static MultiDeviceRC myRC = new MultiDeviceRC();
    //TODO : 인터넷TV 구현
//      TVinterface myInternetTV = new InternetTV(25, 50);
    static ACinterface Aircon = new AirCon(24, 60); //(온도, 바람세기)


    //사용자 커스텀 예외 객체 선언
    public static class CmdException extends Exception{
        public CmdException(String message, Throwable cause){
            super(message, cause);
        }
    }

    // TODO : 예외전환 처리
    //명령 입력 후 버튼조작 메소드
    //btnPress 를 수행하는 부분을 별개의 메소드로 만들어 두고, 그 메소드를 호출하는 방법으로 오류 검출 하면 될듯
    public static void RemoteControll(String TVid, String tvCmd) {
            if (TVid.equals("tv1")) {
                myRC.btnPress(myCableTv, MultiDeviceRC.Buttons.getBtn(tvCmd));
            } else if (TVid.equals("tv2")) {
                myRC.btnPress(Aircon, MultiDeviceRC.Buttons.getBtn(tvCmd));
            } else {
                System.out.println("잘못된 접근입니다.");
            }
    }

    public static void main(String[] args) throws Exception {

        Scanner myScanner = new Scanner(System.in);

        while(true) {
            //사용자 안내 텍스트
            //TODO:에어컨 명령어 추가
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
            일반 TV = cableTV
            위성 TV = satTV
            에어컨 = air
            ======= 시뮬레이션 종료 ========
                        exit
            ============================
            """);

            //리모컨 입력값 받기
            System.out.println("버튼 입력하세요");
            String  consoleInput = myScanner.nextLine();
            //입력값 파싱
            String TVid = consoleInput.split("_")[0];
            String tvCmd = consoleInput.split("_")[1];



            //종료조건
            if (consoleInput.equals("exit")) {
                System.out.println("종료합니다.");
                return;
            }

            //TODO : 1. main에 직접 작성된 디바이스 판단 부분을 별도 메소드로. (끝)
            //       2. 그 메소드에서 "예외 전환" 수행
            //       3. main메소드에서 디바이스 판단 메소드 호출하면서 전환된 예외 복구

            //대상기기 판단, 호출
                SimulatorMain.RemoteControll(TVid, tvCmd);



            //켜져있는 디바이스 상태 텍스트
//            myCableTv.showVideo();
//            myInternetTv.showVideo();
        }
    }
}
