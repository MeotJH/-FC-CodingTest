package array;


import java.io.*;
import java.util.Arrays;

public class BJ3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] numsStr = br.readLine().split(" ");
        int targetValue = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }
        Arrays.sort(nums);

        int result = 0;
        int left = 0;
        int right = n-1;
        for (int i = 0; i < n; i++) {
            int leftNums = nums[left];
            int rightNums = nums[right];

            if( left == right){
                break;
            }

            if(leftNums + rightNums < targetValue){
                left++;
            }else if (leftNums + rightNums > targetValue) {
                right--;
            } else if (leftNums + rightNums == targetValue) {
                right--;
                result++;
            }

        }
        bw.write(result + "\n");
        bw.flush();
    }
}
