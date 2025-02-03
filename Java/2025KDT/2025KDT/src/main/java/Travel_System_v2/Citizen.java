package Travel_System_v2;

public class Citizen {
    //이름
    public String name;
    //국적
    public String nationality;
    //범죄이력
    public boolean hasCrimeRecord;
    //성별
    public int gender; //1,3:남성  2,4:여성
    //여권 유무
    public boolean hasPassport;
    //이민 대상국가 시민권 유무
    public final boolean Hascityzenship;

    public Citizen(String name, String nationality, boolean hasCrimeRecord, int gender, boolean hasPassport, boolean Hascityzenship) {
        this.name = name;
        this.nationality = nationality;
        this.hasCrimeRecord = hasCrimeRecord;
        this.gender = gender;
        this.hasPassport = hasPassport;
        this.Hascityzenship = Hascityzenship;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    //이건 어디다 쓰지,??
    public int getGender() {
        return gender;
    }
    public boolean isHasPassport() {
        return hasPassport;
    }
    public boolean isHasCrimeRecord() {
        return hasCrimeRecord;
    }
    public boolean isHasCityzenship() {
        return Hascityzenship;
    }

    //입국심사 결과 통보
    public static void screeningResult(Citizen tgCitizen, Nation tgNation) {
        if(tgNation.forTravel(tgCitizen, tgNation)){
            System.out.println("[" + tgCitizen.name + "]" + "이/가 여행 입국 심사를 마치고 " + tgNation.getNationName() + "에 입국했습니다.");
        }else if (!tgNation.forTravel(tgCitizen, tgNation)){
            System.err.println("[" + tgCitizen.name + "]" + "이/가 여행 입국 심사에 실패해 " + tgNation.getNationName() + "에 입국 거부");

        }
    }

    //이민심사 결과 통보
}
