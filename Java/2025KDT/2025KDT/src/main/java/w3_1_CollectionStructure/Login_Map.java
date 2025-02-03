package w3_1_CollectionStructure;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Login_Map {
    private static Map<String, String> idList = new HashMap<>();

    // 회원가입 메소드
    public static void register(String ID, String PW) {
        idList.put(ID, PW);
        System.out.println("가입 완료. 다시 로그인 해 주세요.");
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String usrCmd;

        while (true) {
            System.out.println("\n명령어를 입력하세요 (회원가입, 로그인, 종료): ");
            usrCmd = userInput.next();

            if (usrCmd.equals("회원가입")) {
                System.out.println("ID 를 입력하세요 : ");
                String ID = userInput.next();
                System.out.println("PW 를 입력하세요 : ");
                String PW = userInput.next();
                register(ID, PW);
            }
            else if (usrCmd.equals("로그인")) {
                System.out.println("ID : ");
                String inputID = userInput.next();
                System.out.println("PW : ");
                String inputPW = userInput.next();

                // 로그인 로직
                if (!idList.containsKey(inputID)) {
                    System.out.println("ID가 존재하지 않습니다.");
                } else if (!idList.get(inputID).equals(inputPW)) {
                    System.out.println("비밀번호가 틀렸습니다.");
                } else {
                    System.out.println("로그인 성공");
                }
            }
            else if (usrCmd.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못된 명령어입니다. 다시 입력하세요.");
            }
        }

        userInput.close();
    }
}
