package test205;

import java.util.Scanner;

public class Main {

    public String getNum(Integer limit) {
        int cnt = 0;
        int[] array = new int[limit + 1];
        for(int i=2; i <= limit; i++) {
            if(array[i] == 0) {
                cnt++;
                for(int j=i; j<=limit; j=j+i) {
                    array[j] = 1;
                }
            }
        }

        return String.valueOf(cnt);
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in  = new Scanner(System.in);
        Integer limit = in.nextInt();

        System.out.println(m.getNum(limit));
    }
}
