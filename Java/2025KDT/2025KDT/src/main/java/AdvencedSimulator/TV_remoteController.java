package AdvencedSimulator;

public class TV_remoteController {
    //리모컨 버튼들 생성
    final static String POWER = "pow";
    final static String VOLUME_UP = "vol_up";
    final static String VOLUME_DOWN = "vol_dn";
    final static String CHANNEL_UP = "ch_up";
    final static String CHANNEL_DOWN = "ch_dn";
    final static String BRIGHT_UP = "bright_up";
    final static String BRIGHT_DOWN = "bright_dn";
    final static String CONST_UP = "const_up";
    final static String CONST_DOWN = "const_dn";

    public void btnPress(TV targetTV, String btnInput) {
        //switch 문으로 버튼 눌림 인식, 제어
        switch (btnInput) {
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
                targetTV.contrastUp();
                break;
            case CONST_DOWN:
                targetTV.contrastDown();
                break;
            default:
                break;
        }
    }
}
