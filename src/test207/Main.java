package test207;

import java.util.Scanner;

public class Main {

    public Integer getScore(Integer[] nums) {
        Integer totalPoint = 0;
        Integer addPoint = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                totalPoint += nums[i] + addPoint;
                addPoint++;
            } else {
                addPoint = 0;
            }
        }

        return totalPoint;
    }


    public static void main(String[] args) {
        Main m = new Main();

        Scanner in  = new Scanner(System.in);
        Integer limit = in.nextInt();
        Integer[] strNum = new Integer[limit];

        for(int i=0; i<limit; i++) {
            strNum[i] = in.nextInt();
        }

        System.out.println(String.valueOf(m.getScore(strNum)));
    }
}
