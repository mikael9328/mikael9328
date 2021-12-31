package test210;

import java.util.Scanner;

public class Main {

    public boolean isMount(int[][] arrs, int i, int j) {
        boolean result = true;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int curVal = arrs[i][j];

        for(int k=0; k < 4; k++) {
            if(arrs[i + dx[k]][j + dy[k]] >= curVal) {
                result = false;
            }
        }

        return result;
    }

    public Integer getMaxMount(Integer limit, int[][] arrs) {
        Integer result = 0;

        for(int i=1; i < limit + 1; i++) {
            for (int j = 1; j < limit + 1; j++) {

                if(isMount(arrs, i, j)) {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        Integer limit = in.nextInt();
        int[][] arrs = new int[limit+2][limit+2];

        for(int i=1; i < limit + 1; i++) {
            for(int j=1; j < limit + 1; j++) {
                arrs[i][j] = in.nextInt();
            }
        }

        System.out.println(m.getMaxMount(limit, arrs));
    }
}
