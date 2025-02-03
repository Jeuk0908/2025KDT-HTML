package Travel_System_v2;

import java.util.*;

public class simulatorMain {
    public static HashMap<String, Nation> NationList = new HashMap<>();
    public static List<Nation> Nations = new ArrayList<>();
    public static List<Citizen> peopleName = new ArrayList<>();


    //국가 객체 생성
    static Nation ROK = new Nation("Republic Of Korea", 82, false, 1);
    static Nation USA = new Nation("UnitedStates of America", 1, false, 1);
    //우크라이나 국적자 전부 거부
    static Nation UKR = new Nation("Ukraina", 380, true, 5);


    //시민 객체 생성
    public static Citizen kor1 = new Citizen("유제욱", "Republic Of Korea", false, 3, true, false);
    public static Citizen kor2= new Citizen("황다란", "Republic Of Korea", false, 2, true, false );
    public static Citizen usa1 = new Citizen("John", "UnitedStates of America", false, 2, true, true);
    public static Citizen usa2 = new Citizen("Kyle", "UnitedStates of America", true, 3, true, false);
    public static Citizen ukr1 = new Citizen("Igor", "Ukraina", false, 3, true, true);
    //여권 없어서 다 입국거부
    public static Citizen ukr2 = new Citizen("Lyskov", "Ukraina", true, 3, false, false);

    public static void main(String[] args) {
        //HashMap 에 객체 저장
        NationList.put("Republic Of Korea", ROK);
        NationList.put("UnitedStates of America", USA);
        NationList.put("Ukraina", UKR);
        Nations.add(ROK);
        Nations.add(USA);
        Nations.add(UKR);
        peopleName.add(kor1);
        peopleName.add(kor2);
        peopleName.add(usa1);
        peopleName.add(usa2);
        peopleName.add(ukr1);
        peopleName.add(ukr2);


        //Nation 입국심사 메소드 호출
        for (int i = 0; i < peopleName.size() ; i++ ) {
            for (int j = 0; j < NationList.size(); j++ ) {
                Citizen.screeningResult(peopleName.get(i), Nations.get(j));
            }
        }


        //Nation 이민 심사 메소드 호출


    }
}
