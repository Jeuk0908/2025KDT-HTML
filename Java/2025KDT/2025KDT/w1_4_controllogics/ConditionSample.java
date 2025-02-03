package w1_4_controllogics;
import java.util.Objects;
import java.util.Scanner;//사용자 입력 위한 스캐너 import

public class ConditionSample {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);//사용자 입력
        System.out.println("Input command: ");
        String consoleInput = myScanner.nextLine();

        // ######## if else 문 ######## //
        if (consoleInput.equals("true")) { //문자열 비교는 == 가 아니라 equals() 써야함
            System.out.println("This is true branch!");
        } else if (consoleInput.equals("middle")) {
            System.out.println("This is middle branch!");
        } else {
            System.out.println("This is else branch!");
        }

        // ######## switch 문 ######## //
        int commandInt = Integer.parseInt(consoleInput); //사용자 입력
        switch (commandInt) {
            case 10: //commandInt가 10 일때,
                System.out.println("Low score");
                break; //break 안하면 밑에 케이스들 다 거쳐감
            case 50:
                System.out.println("Middle score");
                break;
            case 90:
                System.out.println("High score");
                break;
            default: // 아무것도 해당 안되면 default케이스. (else 같은 역할)
                System.out.println("Your score is " + commandInt);
                break;
        }
    }
}
