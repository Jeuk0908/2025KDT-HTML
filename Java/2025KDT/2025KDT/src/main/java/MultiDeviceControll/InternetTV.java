//package MultiDeviceControll;
//
//public class InternetTV extends TV {
//    private String internetServiceProvider; //캡슐화. 인터넷 제공자 변수
//
//    public InternetTV(int channel, int volume, String internetServiceProvider) {
//        super(channel, volume);
//        this.internetServiceProvider = internetServiceProvider;
//    }
//
//    public String getInternetServiceProvider() {
//        return internetServiceProvider;
//    }
//
//    public void setInternetServiceProvider(String internetServiceProvider) {
//        this.internetServiceProvider = internetServiceProvider;
//    }
//
//    private boolean checkConnection() {
//        return true;
//    }
//
//    @Override
//    public void showVideo(){
//        if (!powerOn) return;
//        if (!checkConnection()) {
//            System.out.println("인터넷 연결 없음");
//        }
//    }
//
//
//
//}
