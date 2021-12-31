package test201;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String compareInt(int limit, int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        String answer = "";

        for(int i=0 ; i < limit; i++) {
            int num = Integer.valueOf(nums[i]);

            if(i == 0) {
                result.add(num);
            } else {
                if(nums[i-1] < num) {
                    result.add(num);
                }
            }
        }

        for(Integer ans : result) {
            answer += ans + " ";
        }

        return answer.substring(0, answer.length()-1);
    }

    public static void main(String[] args) {

        Main m = new Main();

        Scanner in  = new Scanner(System.in);
        int limit = in.nextInt();
        int[] nums = new int[limit];

        for(int i=0; i<limit ; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println(m.compareInt(limit, nums));
    }
}
