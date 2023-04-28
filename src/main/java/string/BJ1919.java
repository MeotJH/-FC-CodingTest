package string;

import java.util.Scanner;

public class BJ1919 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();


        int[] firstAlpha = getAlphaArr(first);
        int[] secondAlpha = getAlphaArr(second);

        int result = 0;
        // 안에 a-z까지 알파벳 있으면 1 없으면 0 
        // loop 돌면서 똑같이 있으면 0되고 하나만 있으면 1 인걸 다더하면 차이가 나옴
        for (int i = 0; i < 26; i++) {
            result = result + Math.abs(firstAlpha[i] - secondAlpha[i]);
        }

        System.out.println(result);
    }

    private static int[] getAlphaArr(String target) {
        int[] count = new int[26];
        //해당하는 알파벳이 있으면 1을 더해준다. 1이면 있다 0 이면 없다.
        for (int i = 0; i < target.length(); i++) {
            count[target.charAt(i) - 'a']++;
        }
        return count;
    }
}
