package test209;

import java.util.Scanner;

public class Main {

    public Integer compare(Integer tmpMax, Integer pResult) {

        Integer result = 0;
        return result = tmpMax > pResult ? tmpMax : pResult;
    }

    public Integer getMax(Integer limit, Integer[][] arrs) {
        Integer result = 0;
        Integer tmpMax = 0;

        for(int i=0; i < limit; i++) {
            tmpMax =0;
            for (int j = 0; j < limit; j++) {
                tmpMax += arrs[i][j];
            }
            result = compare(tmpMax, result);

            tmpMax =0;
            for (int k = 0; k < limit; k++) {
                tmpMax += arrs[k][i];
            }
            result = compare(tmpMax, result);


            tmpMax =0;
            tmpMax += arrs[i][i];
            result = compare(tmpMax, result);
        }

        tmpMax =0;
        for(int i=limit-1; i >= 0; i--) {
            tmpMax += arrs[i][i];
        }
        result = compare(tmpMax, result);

        return result;
    }

    public static void main(String[] args) {

        Main m = new Main();

        Scanner in = new Scanner(System.in);
        Integer limit = in.nextInt();
        Integer[][] arrs = new Integer[limit][limit];

        for(int i=0; i < limit; i++) {
            for(int j=0; j < limit; j++) {
                arrs[i][j] = in.nextInt();
            }
        }

        System.out.println(m.getMax(limit, arrs));

    }
}
