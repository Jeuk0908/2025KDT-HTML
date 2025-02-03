package TV_interface_abstract_enum;

public class TV_remoteController{
    //리모컨 버튼들 생성
    public boolean powerOn;

    public TV_remoteController() {
        this.powerOn = true;
    }

    public enum TVButtons {
        //생성자 있는 형태로.
        // 1. 각 상수 enum 에 "user_cmd" 속성 부여
        // 2. "user_cmd" 속성을 대상 디바이스별 함수 호출로 연결 할 수 있도록 구현
        POWER("pow"),
        VOLUME_UP("volUp"),
        VOLUME_DOWN("volDn"),
        CHANNEL_UP("chUp"),
        CHANNEL_DOWN( "chDn"),
        BRIGHT_UP("brightUp"),
        BRIGHT_DOWN("brightDn"),
        CONST_UP("constUp"),
        CONST_DOWN("constDn"),
        SHOW_VIDEO( "show");

        private String user_cmd;

        TVButtons(String user_cmd) {
            this.user_cmd = user_cmd;
        }

        public static TVButtons getBtn(String user_cmd) {
            for (TVButtons btn : TVButtons.values()) {
                if (btn.user_cmd.equals(user_cmd)) {
                    btn.user_cmd = user_cmd;
                    return btn;
                }
            }
            throw new IllegalAccessError("Command is invalid" + user_cmd); //뭘 눌렀는지 알려줌
        }
    }


    //리모컨에서 대상TV값, 명령어 입력받음
    //tvCmd 를 enum의 상수를 받게 변경.
    public void btnPress(TV_interface targetTV,TVButtons tvCmd) {
        //switch 문으로 버튼 눌림 인식, 제어
        switch (tvCmd) {
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
                break;
        }
    }
}
