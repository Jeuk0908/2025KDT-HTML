package MultiDeviceControll;

public class CableTV implements TVinterface{
    //TV기능 선언 필드
    public boolean powerOn;
    private int channel;
    private int volume;
    private int brightness;
    private int contrast;

    //생성자
    public CableTV(int channel, int volume, int brightness, int contrast) {
        this.powerOn = false;
        this.channel = channel;
        this.volume = volume;
        this.brightness = brightness;
        this.contrast = contrast;
    }

    @Override
    public void powerToggle() {
        if(this.powerOn = false) {
            this.powerOn = true;
            System.out.println("케이블TV 켜짐");
        }else {
            this.powerOn = false;
            System.out.println("케이블TV 꺼짐");
        }
    }

    @Override
    public void channelUp() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.channel++;
        System.out.println("현재 채널 : " + this.channel + "번");
    }

    @Override
    public void channelDown() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.channel--;
        System.out.println("현재 채널 : " + this.channel + "번");
    }

    //볼륨
    @Override
    public void volumeUp() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.volume++;
        System.out.println("현재 볼륨 : " + this.volume);
    }

    @Override
    public void volumeDown() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.volume--;
        System.out.println("현재 볼륨 : " + this.volume);
    }

    //밝기
    @Override
    public void brightnessUp() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.brightness++;
        System.out.println("현재 밝기 : " + this.brightness);
    }

    @Override
    public void brightnessDown() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.brightness--;
        System.out.println("현재 밝기 : " + this.brightness);
    }

    //대비
    @Override
    public void constUp() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.contrast++;
        System.out.println("현재 대비값 : " + this.contrast);
    }

    @Override
    public void constDown() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.contrast--;
        System.out.println("현재 밝기 : " + this.contrast);
    }

    //추가 사항
    public void showVideo() {
        if (!this.powerOn) {
            return;
        }
        System.out.println("TV 에서 유선방송이 송출됩니다.");
    }
    //생성자
}
