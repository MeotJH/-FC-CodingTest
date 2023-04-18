package array;

import java.util.Scanner;

public class BJ10431 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        while(P --> 0){
            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                h[i] = sc.nextInt();
            }
            int cnt = 0;
            int[] sorted = new int[20];
            for (int i = 0; i < 20; i++) {
                //1. 줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
                // 1-1. 찾지 못했다면 줄의 가장 뒤에 선다.
                boolean find = false;
                for (int j = 0; j < i; j++) {
                    if(sorted[i]>h[j]){
                        //2. 찾았다면, 그 학생의 앞에 선다.
                        //3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        find =true;
                        //이부분 생각 못했다 거꾸로 포문 돌면서 뒤에서 하나씩 당겨주기
                        for (int k = 0; k >= j; k--) {
                            sorted[k + 1] = sorted[k];
                            cnt++;
                        }
                        sorted[j] = h[i];
                        break;
                    }

                }
                if(!find){
                    sorted[i] = h[i];
                }
            }
            System.out.println(T + " " + cnt);

        }
    }
    public static void MyMain(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int rslt = p;

        int[][] nums = new int[p][20];
        int[] rsltArr = new int[p];
        while (p > 0){
            sc.nextInt();
            for (int i = 0; i < 20; i++) {
                nums[p-1][i] = sc.nextInt();
            }


            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    int chageTarget = nums[p-1][i];
                    int compTarget = nums[p-1][j];

                    if(chageTarget < compTarget){
                        nums[p-1][j] = chageTarget; // 2를 3주소에 넣음
                        int next = 0;
                        for (int k = j; k < 20; k++) {

                            if(k+1 >= 20){
                                break;
                            }

                            next = nums[p - 1][k+1];
                            if( next == chageTarget){
                                nums[p-1][i] = compTarget; // 바로 앞뒤면 그냥 앞뒤 섞음
                                break;
                            }
                            nums[p - 1][k+1] = compTarget; // 3을 4주소에 넣음
                            compTarget = next; // 4를 임시 주소에 넣음
                        }

                        rsltArr[p-1] = rsltArr[p-1] + (i - j);
                    }
                }
            }
            p--;
            sc.nextLine();
        }

        int temp = 0;
        for (int i = rslt; i > 0; i--) {
            temp++;
            System.out.println(temp + " " +rsltArr[rslt-temp]);
        }


    }
}
