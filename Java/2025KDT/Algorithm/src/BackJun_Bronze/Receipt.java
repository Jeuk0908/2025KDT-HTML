package BackJun_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receipt {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 총 가격을 정수형으로 입력받음
            int total = Integer.parseInt(br.readLine());

            // 9권의 값을 총 가격에서 뻄
            for (int i = 1; i <= 9; i++) {
                total -= Integer.parseInt(br.readLine());
            }
            System.out.print(total);
        }
    }

