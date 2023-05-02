package brute_force;

import java.io.*;
import java.util.ArrayList;

public class BJ11005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int targetNum = Integer.parseInt(inputs[0]);
        int xNumber = Integer.parseInt(inputs[1]);

        ArrayList<Integer> xnumbers = new ArrayList<>();


        while( targetNum > 0 ){

            xnumbers.add(targetNum % xNumber);
            targetNum = targetNum / xNumber;

        }

        for (int i = xnumbers.size()-1; i >= 0; i--) {
            int each = xnumbers.get(i);
            if( each <= 9 ){
                bw.write(Integer.toString(each));
            }else{
                bw.write((char)65+ (each - 10));
            }
        }
        bw.write("\n");
        bw.flush();

    }
}
