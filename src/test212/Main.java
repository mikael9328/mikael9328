package test212;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public int getCaseCnt(int stdCnt, int winCnt, int[][] arrs) {
        int result = 0;

        Set<Integer> candidate = new HashSet<>();

        for(int i=0; i < winCnt; i++) {
            int curStd = arrs[0][i];
            for(int j=0; j < winCnt; j++){

                if(i == 0 && curStd == arrs[i][j]) {
                    for(int k=j+1;  k<stdCnt; k++) {
                        candidate.add(arrs[i][k]);
                    }
                } else if(i != 0 && curStd == arrs[i][j]){
                    for(int k=j+1;  k<stdCnt; k++) {
                        candidate.remove(arrs[i][k]);
                    }
                }
            }
            result += candidate.size();
        }


        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in = new Scanner(System.in);

        int stdCnt = in.nextInt();
        int winCnt = in.nextInt();
        int[][] arrs = new int[winCnt][stdCnt];

        for(int i=0; i < winCnt; i++) {
            for(int j=0; j < stdCnt; j++) {
                arrs[i][j] = in.nextInt();
            }
        }

        System.out.println(m.getCaseCnt(stdCnt, winCnt, arrs));
    }
}
