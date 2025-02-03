package MultiDeviceControll;

public class AirCon implements ACinterface {
    private boolean powerOn;
    private int temp; //온도는 섭씨 화씨 표현가능한게 좋다.
    private int windStrength;


    public AirCon(int temp, int windStrength) {
        this.powerOn = false;
        this.temp = temp;
        this.windStrength = windStrength;
    }


    @Override
    public void powerToggle() {
        this.powerOn = !this.powerOn;
        if(this.powerOn){
            System.out.println("AC 켜짐");
        }else {
            System.out.println("AC 꺼짐");
        }
    }

    @Override
    public void tempUp() {
        if(!this.powerOn){
            return;
        }
        this.temp++;
        System.out.println("설정온도 : " + this.temp + "c");
    }

    @Override
    public void tempDown() {
        if(!this.powerOn){
            return;
        }
        this.temp--;
        System.out.println("설정온도 : " + this.temp + "c");

    }

    @Override
    public void windUp() {
        if(!this.powerOn){
            return;
        }
        this.windStrength = this.windStrength + 10;
        System.out.println("바람 세기 : " + this.windStrength);

    }

    @Override
    public void windDown() {
        if(!this.powerOn){
            return;
        }
        this.windStrength = this.windStrength - 10;
        System.out.println("바람 세기 : " + this.windStrength);

    }
}
