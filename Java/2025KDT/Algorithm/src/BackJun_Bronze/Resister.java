package BackJun_Bronze;

import java.io.*;
import java.util.*;

public class Resister {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //중첩 map 자료형으로 색깔별 값 넣기
        HashMap<String,String> colorsMap = new HashMap<>();
        colorsMap.put("black","0");
        colorsMap.put("brown","1");
        colorsMap.put("red","2");
        colorsMap.put("orange","3");
        colorsMap.put("yellow","4");
        colorsMap.put("green","5");
        colorsMap.put("blue","6");
        colorsMap.put("violet","7");
        colorsMap.put("gray","8");
        colorsMap.put("white","9");

        //색에 맞는 키값 출력하는 메소드 호출
        String firstcolor = br.readLine();
        String secondcolor = br.readLine();
        String thirdcolor = br.readLine();
        //1번 색의 값과 2번색의 값 합쳐서 long 형태로 변환
        long ans = Long.parseLong(colorsMap.get(firstcolor) + colorsMap.get(secondcolor));
        //10을 3번 색의 값만큼 거듭제곱해 곱할 값을 만들어주고, ans 에 곱해줌
        ans *= Math.pow(10.0, (double) Integer.parseInt(colorsMap.get(thirdcolor)));
        System.out.print(ans);

        }

    }

