package array;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1236 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] multiDiArr = new char[n][m];
        for (int i = 0; i < n; i++) {

            String oneLine = sc.nextLine();
            for (int j = 0; j < m; j++) {
                multiDiArr[i][j] = oneLine.charAt(j);
            }

        }

        int[] nNum = new int[m];
        int[] mNum = new int[n];

        for (int i = 0; i < m; i++) {

            int temp = 0;
            for (int j = 0; j < n; j++) {
                char c = multiDiArr[j][i];
                if( c == 'X' ){
                    temp++;
                }
            }
            nNum[i] = temp;
        }

        for (int i = 0; i < n; i++) {

            int temp = 0;
            for (int j = 0; j < m; j++) {
                char c = multiDiArr[i][j];
                if( c == 'X' ){
                    temp++;
                }
            }
            mNum[i] = temp;
        }

        int nRslt = 0;
        int mRslt = 0;
        for (int i = 0; i < m; i++) {
            if(nNum[i] == 0){
                nRslt ++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(mNum[i] == 0){
                mRslt ++;
            }
        }

        System.out.println(Math.max(nRslt,mRslt));

    }
}
