package timecomplex;

import java.util.Scanner;

public class BJ10158 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] maxLocationStr = sc.nextLine().split(" ");
        String[] antLocationStr = sc.nextLine().split(" ");

        int[] maxLocation = new int[2];
        int[] antLocation = new int[2];
        for (int i = 0; i < 2; i++) {
            maxLocation[i] = Integer.parseInt(maxLocationStr[i]);
            antLocation[i] = Integer.parseInt(antLocationStr[i]);
        }

        int targetTime = Integer.parseInt(sc.nextLine());

        int deltaX = 1;
        int deltaY = 1;

        for (int i = 0; i < targetTime; i++) {

            if( antLocation[0] == maxLocation[0] )deltaX = -1;
            else if (antLocation[0] == 0) deltaX = 1;
            if( antLocation[1] == maxLocation[1]) deltaY = -1;
            else if (antLocation[1] == 0) deltaY = 1;
            antLocation[0] += deltaX;
            antLocation[1] += deltaY;

        }

        System.out.println(antLocation[0] + " " + antLocation[1]);
    }
}
