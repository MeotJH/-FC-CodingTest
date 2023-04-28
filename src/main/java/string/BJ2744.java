package string;

import java.util.Scanner;

public class BJ2744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int diffrentNum = 32;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] <= 90 ){
                sb.append((char)(chars[i] + diffrentNum));
            }else{
                sb.append((char)(chars[i] - diffrentNum));
            }
        }
        System.out.println(sb.toString());
    }
}
