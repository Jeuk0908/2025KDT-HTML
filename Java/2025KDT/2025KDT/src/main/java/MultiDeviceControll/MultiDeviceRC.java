package MultiDeviceControll;

public class MultiDeviceRC {
    //리모컨 버튼들 생성
    public boolean powerOn;

    public MultiDeviceRC() {
        this.powerOn = true;
    }

    public enum Buttons {
        //생성자 있는 형태로.
        // 1. 각 상수 enum 에 "user_cmd" 속성 부여
        // 2. "user_cmd" 속성을 대상 디바이스별 함수 호출로 연결 할 수 있도록 구현
        POWER("pow"),
        VOLUME_UP("volUp"),
        VOLUME_DOWN("volDn"),
        CHANNEL_UP("chUp"),
        CHANNEL_DOWN("chDn"),
        BRIGHT_UP("brightUp"),
        BRIGHT_DOWN("brightDn"),
        CONST_UP("constUp"),

        CONST_DOWN("constDn"),
        SHOW_VIDEO("show"),
        WIND_UP("windUp"),
        WIND_DOWN("windDn"),
        TEMP_UP("tmpUp"),
        TEMP_DOWN("tmpDn");

        private String user_cmd;

        Buttons(String user_cmd) {
            this.user_cmd = user_cmd;
        }

        public static Buttons getBtn(String user_cmd) {
            for (Buttons btn : Buttons.values()) {
                if (btn.user_cmd.equals(user_cmd)) {
                    btn.user_cmd = user_cmd;
                    return btn;
                }
            }
            throw new IllegalAccessError("Command is invalid" + user_cmd); //뭘 눌렀는지 알려줌
        }
    }

        //메소드 오버로딩 방식이 가능
//        public void btnPress(InternetTV tgTV, String cmd) {}
//        public void btnPress(SatelliteTV tgTV, String cmd){}

        //하지만 인터페이스 다형성 사용한 처리가 더 좋음
        //인터페이스 있으면 메소드 하나에 인터페이스 상위 객체로 사용 가능
        public void btnPress(TVinterface targetTV, Buttons btnCmd) {
            switch (btnCmd) {
                case POWER:
                    targetTV.powerToggle();
                    break;
                case VOLUME_UP:
                    targetTV.volumeUp();
                    break;
                case VOLUME_DOWN:
                    targetTV.volumeDown();
                    break;
                case CHANNEL_UP:
                    targetTV.channelUp();
                    break;
                case CHANNEL_DOWN:
                    targetTV.channelDown();
                    break;
                case BRIGHT_UP:
                    targetTV.brightnessUp();
                    break;
                case BRIGHT_DOWN:
                    targetTV.brightnessDown();
                    break;
                case CONST_UP:
                    targetTV.constUp();
                    break;
                case CONST_DOWN:
                    targetTV.constDown();
                    break;
                case SHOW_VIDEO:
                    targetTV.showVideo();
                    break;
                default:
                    //없는 명령 입력시.
                    System.out.println("미구현 버튼입니다.");
                    break;
            }
        }


        //에어컨 리모컨
        public void btnPress(ACinterface targetAC, Buttons btnCmd){
            switch (btnCmd) {
                case POWER:
                    targetAC.powerToggle();
                    break;
                case TEMP_UP:
                    targetAC.tempUp();
                    break;
                case TEMP_DOWN:
                    targetAC.tempDown();
                    break;
                case WIND_UP:
                    targetAC.windUp();
                    break;
                case WIND_DOWN:
                    targetAC.windDown();
                    break;
                default:
                    System.out.println("미구현 버튼입니다.");
            }
        }
    }

