package String;

import java.util.Arrays;
import java.util.Scanner;

public class BJ13223 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] now = sc.nextLine().split(":");
        String[] target = sc.nextLine().split(":");

        int nowHour = Integer.parseInt(now[0]);
        int nowMinute = Integer.parseInt(now[1]);
        int nowSecond = Integer.parseInt(now[2]);

        int targetHour = Integer.parseInt(target[0]);
        int targetMinute = Integer.parseInt(target[1]);
        int targetSecond = Integer.parseInt(target[2]);

        int currentSecondAmount = nowHour * 3600 + nowMinute * 60 + nowSecond;
        int targetSecondAmount = targetHour * 3600 + targetMinute * 60 + targetSecond;

        int resultTime = targetSecondAmount - currentSecondAmount;
        if( resultTime <= 0){
            resultTime += (24 * 3600);
        }

        int resultHour = resultTime / 3600;
        int resultMinute = (resultTime % 3600) / 60; // 이부분 ?!?!
        int resultSecond = resultTime % 60;

        System.out.println(String.format("%02d:%02d:%02d", resultHour, resultMinute, resultSecond));
    }
}
