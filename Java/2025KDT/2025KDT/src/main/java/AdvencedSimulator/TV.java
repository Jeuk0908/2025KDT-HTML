package AdvencedSimulator;

public class TV {
    //TV의 기능 정의한 변수
    private boolean powerOn;
    private int channel;
    private int volume;
    private int brightness;
    private int contrast;

    //생성자 (상수)
    public TV() {
        this.powerOn = false; //꺼져있는게 기본
    }

    //생성자 2
    public TV(int channel, int volume, int brightness, int contrast) {
        this.powerOn = false;
        this.channel = channel;
        this.volume = volume;
        this.brightness = brightness;
        this.contrast = contrast;
    }

    //전원 기능
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
    public void channelUp() {
            if (!this.powerOn) {
                return; //전원 꺼져있으면 반응 없음
            }
            this.channel++;
            System.out.println("현재 채널 : " + this.channel + "번");
        return;
        }

        public void channelDown() {
            if (!this.powerOn) {
                return; //전원 꺼져있으면 반응 없음
            }
            this.channel--;
            System.out.println("현재 채널 : " + this.channel + "번");
        }

        //볼륨
        public void volumeUp() {
            if (!this.powerOn) {
                return; //전원 꺼져있으면 반응 없음
            }
            this.volume++;
            System.out.println("현재 볼륨 : " + this.volume);
        }

        public void volumeDown() {
            if (!this.powerOn) {
                return; //전원 꺼져있으면 반응 없음
            }
            this.volume--;
            System.out.println("현재 볼륨 : " + this.volume);
        }

        //밝기
        public void brightnessUp() {
            if (!this.powerOn) {
                return; //전원 꺼져있으면 반응 없음
            }
            this.brightness++;
            System.out.println("현재 밝기 : " + this.brightness);
        }

        public void brightnessDown() {
            if (!this.powerOn) {
                return; //전원 꺼져있으면 반응 없음
            }
            this.brightness--;
            System.out.println("현재 밝기 : " + this.brightness);
        }

    //대비
    public void contrastUp() {
        if (!this.powerOn) {
            return; //전원 꺼져있으면 반응 없음
        }
        this.contrast++;
        System.out.println("현재 대비값 : " + this.contrast);
    }

    public void contrastDown() {
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
        System.out.println("TV 에서 위성/디지털 방송이 송출됩니다.");
        }
    }
