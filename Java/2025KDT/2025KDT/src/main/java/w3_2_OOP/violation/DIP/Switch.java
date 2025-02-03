package w3_2_OOP.violation.DIP;

public class Switch {
    private RedLight light; //똑딱이 스위치. 제어 대상인 RedLight클래스를 light로 선언. 전구 안에 스위치를 넣은 꼴.
    
    public Switch() {
        this.light = new RedLight();
    }
    
    public void On() {
        if (light != null) {
            light.On();
        }
    }
}

class RedLight {
    public void On() {
        System.out.println("Red Light turned on");
    }
}