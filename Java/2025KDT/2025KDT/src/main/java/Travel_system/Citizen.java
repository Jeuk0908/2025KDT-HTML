package Travel_system;

public class Citizen implements GetCitizenInfo {
    // 이름
    public String name;
    // 국적
    public String nationality;
    // 여권번호
    public int PassportNum;
    // 성별
    public String gender;
    // 범죄
    public String crime;

    //생성자
    public Citizen(String name, String nationality, int passportNum, String gender, String crime) {
        this.name = name;
        this.nationality = nationality;
        this.PassportNum = passportNum;
        this.gender = gender;
        this.crime = crime;
    }

    //객체생성
    Citizen Jhon = new Citizen("Jhon", "UnitedStatesOfAmerica", 00001, "Male", null);
    Citizen Kim = new Citizen("Kim", "RepublicOfKorea", 00002, "Female", null);
    Citizen Abdul = new Citizen("Abdul", "Iraq", 00003, "Male", null);

//    public void travel(Nation tgNation) {
//        // 여행 대상국에서 검사 통과/차단 케이스에 따라서
//        // 시민의 상태 변화 및 출력을 구현
//        boolean screenPassed = tgNation.screenImmigration(
//                this
//                // 또는
//                // this.특정정보1, this.특정정보2
//        );
//        if (screenPassed) {
//            System.out.println("대상 국가 입국 성공");
//        }
//    }

    public void emigration(Nation tgNation) {
        // 이민 대상국에서 검사 통과/차단 케이스에 따라서
        // 시민의 상태 변화 및 출력을 구현
    }


    //성별 출력
    @Override
    public String getGender(String name) {
        if (name.equals("Jhon")) {
            return Jhon.gender;
        } else if (name.equals("Kim")) {
            return Kim.gender;
        } else if (name.equals("Abdul")) {
            return Abdul.gender;
        } else {
            System.out.println("신원조회불가 : " + name);
        }
        return null;
    }

    //범죄기록 출력
    @Override
    public String getCrimeRecord(String name) {
        if (name.equals("Jhon")) {
            return Jhon.crime;
        } else if (name.equals("Kim")) {
            return Kim.crime;
        } else if (name.equals("Abdul")) {
            return Abdul.crime;
        } else {
            System.out.println("신원조회불가 : " + name);
        }
        return null;
    }

    //여권번호 출력
    @Override
    public int getPassportNum(String name) {
        if (name.equals("Jhon")) {
            return Jhon.PassportNum;
        } else if (name.equals("Kim")) {
            return Kim.PassportNum;
        } else if (name.equals("Abdul")) {
            return Abdul.PassportNum;
        } else {
            System.out.println("신원조회불가 : " + name);
        }
        return 0;
    }
}
