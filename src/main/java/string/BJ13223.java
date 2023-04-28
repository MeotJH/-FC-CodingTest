package string;

import java.util.Arrays;
import java.util.Scanner;

public class BJ13223 {

    public static void mainKJH(String[] args) {
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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] now = sc.nextLine().split(":");
        String[] target = sc.nextLine().split(":");

        int[] nowNum = Arrays.stream(now).mapToInt(Integer::parseInt).toArray();
        int[] targetNum = Arrays.stream(target).mapToInt(Integer::parseInt).toArray();

        int[] result = new int[3];

        // 2 , 1 , 0
        int loopTime = nowNum.length - 1;
        for (int i = loopTime; i >= 0 ; i--) {
            int targetOne = targetNum[i];
            int nowOne = nowNum[i];

            if( targetOne < nowOne){

                if(  i == 0 ){
                    targetOne = targetOne + 24;
                }else{
                    targetNum[i-1] = targetNum[i-1] -1;
                    targetOne = targetOne + 60;
                }

            }

            if( i==0 && targetOne == nowOne){
                targetOne = targetOne + 24;
            }

            result[i] = targetOne - nowOne;
        }


        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", result[0])).append(":").append(String.format("%02d", result[1])).append(":").append(String.format("%02d", result[2]));

        System.out.println(sb);
    }
}
