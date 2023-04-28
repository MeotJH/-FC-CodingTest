package brute_force;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BJ10448 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer nums = Integer.parseInt(br.readLine());

        int triangleNum = 0;
        int i = 1;
        List<Integer> triangleArr = new ArrayList<>();
        while ( triangleNum < 1000){
            triangleNum = triangleNum + i;
            triangleArr.add(triangleNum);
            i ++;
        }

        while ( nums --> 0){
            int targetNum = Integer.parseInt(br.readLine());

            List<Integer> targetArr = new ArrayList<>();
            for (int j = 0; triangleArr.get(j) < targetNum; j++) {
                targetArr.add(triangleArr.get(j));
            }

            boolean tempRslt = false;
            for (int j = 0; j < targetArr.size(); j++) {
                for (int k = j; k < targetArr.size(); k++) {
                    for (int l = k; l < targetArr.size(); l++) {
                        int resultNum = targetArr.get(j) + targetArr.get(k) + targetArr.get(l);
                        if( resultNum == targetNum){
                            tempRslt = true;
                            break;
                        }
                    }
                }
            }
            if( tempRslt == false){
                bw.write("0\n");
            }else{
                bw.write("1\n");
            }
        }

        bw.flush();

    }
}
