package string;

import java.util.Locale;
import java.util.Scanner;

public class BJ1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String upperCase = str.toUpperCase(Locale.ROOT);

        int[] strArr = new int[26];

        for (int i = 0; i < upperCase.length(); i++) {
            char one = upperCase.charAt(i);
            strArr[one - 'A']++;
        }

        int tempKey = strArr[0];
        int rslt = 0;
        for (int i = 1; i < strArr.length; i++) {

            if(strArr[i] > tempKey){
                tempKey = strArr[i];
                rslt = i;
            }else if(strArr[i] == tempKey){
                rslt = 63;
            }

        }

        if( rslt == 63){
            System.out.println((char)rslt);
        }else{
            System.out.println((char)(rslt+65));
        }
    }
}
