package Travel_System_v2;

import java.util.HashMap;

import static Travel_System_v2.simulatorMain.NationList;


public class Nation {
    //국가 이름
    public String nationName;
    //국가 번호
    public int nationID;
    //전시상황
    public boolean inWar;
    //여행 위험도 (1: 안전, 2:관심, 3:주의, 4:경고, 5:금지)
    public int cautionRate;
    //simulator 의 객체를 여기로 가져와서 사용하기위한 Map객체 생성.
    static HashMap<String, Nation> Nations = new HashMap<String, Nation>(NationList);

    //생성자
    public Nation(String nationName, int nationID, boolean inWar, int cautionRate) {
        this.nationName = nationName;
        this.nationID = nationID;
        this.inWar = inWar;
        this.cautionRate = cautionRate;
    }

    //getter
    public boolean isInWar() {
        return inWar;
    }

    public int getNationID() {
        return nationID;
    }

    public int getCautionRate() {
        return cautionRate;
    }

    public String getNationName() {
        return nationName;
    }


    //여행 입국 심사 메소드 / 이름, 목적(여행, 이민)
    public static boolean forTravel(Citizen citizen , Nation tgNation) {
        //국적 가져옴
        String country = String.valueOf(citizen.getNationality());
        //전시상황 국가이면 입국 거부 (난민)
        if (!NationList.get(country).isInWar()){
            return false;
        //여권 없으면 입국 거부
        }else if (!citizen.isHasPassport()) {
            return false;
        }else{
        System.out.println(Nations);
            return true;
        }
    }

    //이민 입국 심사 메소드
//    public boolean forImmigrant(Citizen name){
//        //심사 기준 (여행 입국 기준 + 시민권 유무)
//        //국적 가져옴
//        String country = String.valueOf(Nations.containsKey(name.getNationality()));
//        //국가 정보 조회
//        Nation Info = Nations.get(country);
//        //전시상황 국가이면 입국 거부 (난민으로 처리)
//        if (Info.inWar){
//            return false;
//            //시민권 없으면 이민 거부
//        } else if (!name.isHasCityzenship()){
//            return false;
//            //전과 있어도 이민 거부
//        } else if (name.isHasCrimeRecord()){
//            return false;
//        }else{
//                return true;
//        }
//    }
}

