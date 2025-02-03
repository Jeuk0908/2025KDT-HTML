package TV_interface_abstract_enum;

//그냥 TV클래스 상속해서 만들어보기
public class TV_satellite implements TV_interface{
    //TV의 기능 정의한 변수
    public boolean powerOn;
    private int channel;
    private int volume;
    private int brightness;
    private int contrast;

    //생성자 (상수)
    public TV_satellite() {
        this.powerOn = false; //꺼져있는게 기본
    }

    //생성자 2
    public TV_satellite(int channel, int volume, int brightness, int contrast) {
        this.powerOn = false;
        this.channel = channel;
        this.volume = volume;
        this.brightness = brightness;
        this.contrast = contrast;
    }

    //전원 기능
    @Override
    public void powerToggle() {
        if (this.powerOn == false) {
            this.powerOn = true;
            System.out.println("전원 켜짐");
        } else if (this.powerOn == true) {
            this.powerOn = false;
            System.out.println("전원 꺼짐");
            return;
        }
    }

    //채널
    @Override
    public void channelUp() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.channel++;
        System.out.println("현재 채널 : " + this.channel + "번");
        return;
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
    @Override
    public void showVideo() {
        if (!this.powerOn) {
            return;
        }
        System.out.println("TV 에서 위성 방송이 송출됩니다.");
    }
}
