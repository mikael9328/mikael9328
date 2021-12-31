package test211;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static final int maxGrade = 5;

    public static int getTotCnt(int curStd, int limit, int[][] arrs) {
        Set<Integer> frdArr = new HashSet<>();

        for(int i=0; i < maxGrade; i++) {
            for(int j=0; j < limit; j++ ) {
                if( curStd != j && arrs[curStd][i] == arrs[j][i]) {
                    frdArr.add(j+1);
                }
            }
        }
        return frdArr.size();
    }

    public Integer getPresident(Integer limit, int[][] arrs) {
        Integer result = 0;
        Integer totCnt = 0;
        Integer maxCnt = 0;

        for(int curStd=0; curStd < limit; curStd++) {
            totCnt = Main.getTotCnt(curStd, limit, arrs);
            if(totCnt > maxCnt) {
                maxCnt = totCnt;
                result = curStd + 1;
            }
       }
        return result == 0 ? 1 : result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        Integer limit = in.nextInt();
        int[][] arrs = new int[limit][maxGrade];

        for(int i=0; i < limit; i++) {
            for(int j=0; j < maxGrade; j++) {
                arrs[i][j] = in.nextInt();
            }
        }
        System.out.println(m.getPresident(limit, arrs));
    }
}
