package Travel_system;

public class Nation implements GetNationInfo {
   // 입국 심사를 수행하는 기준이나
   // 심사를 받을 때 제출할 기준도 필드(인스턴스 변수)로 선언 필요
   // 전시상태 여부
   static boolean InWar;
   // 국가 신용등급 (1 ~ 5)
   public int CreditRating;
   // 국가 위험 등급 (1 ~ 5)
   public int CautionRate;
   // 국가 번호
   public int NationID;
   // 이름
   public String NationName;


   public Nation() {
      this.InWar = false;
   }

   public Nation(boolean Inwar, int CautionRate, int CreditRating, int NationID, String NationName) {
      this.InWar = false;
      this.CautionRate = CautionRate;
      this.CreditRating = CreditRating;
      this.NationID = NationID;
      this.NationName = NationName;
   }

   //각 국가 객체 생성
   Nation ROK = new Nation(false,5, 1,82, "RepublicOfKorea");
   Nation USA = new Nation(false, 5, 1,1, "UnitedStatesOfAmerica");
   Nation JAP = new Nation(false, 5, 1,81, "Japan");
   Nation IRAQ = new Nation(true,1, 4, 964, "Iraq");

   // 입국 심사
   public boolean screenImmigration(
           // 여행자, 이민자 등 정보 수신 필요
           // 개인 정보만 들어오면 될 수도 있고
           // 국적에 해당하는 객체 참조 필요할 수도 있음
           // 파라미터 개수와 관계 없이 데이터 접근만 가능하면 됨
           Citizen screenTgPerson, String InfoCmd
   ) {

      // 심사 기준 TBD
      // 조건문 검사 수행
      return true;
   }


   //국가번호 출력
   @Override
   public int getNationNum(String name) {
      if (name.equals(ROK.NationName)) {
         return ROK.NationID;
      } else if (name.equals(USA.NationName)) {
         return USA.NationID;
      } else if (name.equals(JAP.NationName)) {
         return JAP.NationID;
      } else if (name.equals(IRAQ.NationName)) {
         return IRAQ.NationID;
      }
      else {
         System.out.println("Wrong name : " + name);
      }
      return 0;
   }

   //전시중인지 출력
   @Override
   public boolean getWarInfo(int nationID) {
      if (nationID == ROK.NationID) {
         return ROK.InWar;
      } else if (nationID == USA.NationID) {
         return USA.InWar;
      } else if (nationID == JAP.NationID) {
         return JAP.InWar;
      } else if (nationID == IRAQ.NationID) {
         return IRAQ.InWar;
      }
      else {
         System.out.println("Wrong ID : " + nationID);
         return false;
      }
   }

   //신용등급 출력
   @Override
   public int getNationCredit(int nationID) {
      if (nationID == ROK.NationID) {
         return ROK.CreditRating;
      } else if (nationID == USA.NationID) {
         return USA.CreditRating;
      } else if (nationID == JAP.NationID) {
         return JAP.CreditRating;
      }else if (nationID == IRAQ.NationID) {
         return IRAQ.CreditRating;
      }
      else {
         System.out.println("Wrong ID : " + nationID);
         return 0;
      }
   }

   //여행 경고 등급 출력
   @Override
   public int getNationCautionRate(int nationID) {
      if (nationID == ROK.NationID) {
         return ROK.CautionRate;
      } else if (nationID == USA.NationID) {
         return USA.CautionRate;
      } else if (nationID == JAP.NationID) {
         return JAP.CautionRate;
      } else if (nationID == IRAQ.NationID) {
         return IRAQ.CautionRate;
      }
      return 0;
   }


}