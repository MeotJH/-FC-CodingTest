package array;

import java.util.Scanner;

public class BJ10431 {

    public static void main(String[] args) {

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
