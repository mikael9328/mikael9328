package test204;

import java.util.Scanner;

public class Main {

    public String getNumArray(Integer limit) {
        String result = "";

        Integer[] array = new Integer[limit];

        for(int i=0; i < limit; i++) {
            if(i > 1) {
                array[i] = array[i - 2] + array[i-1];
            } else {
                array[i] = 1;
            }
            result += array[i] + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in  = new Scanner(System.in);
        Integer limit = in.nextInt();

        System.out.println(m.getNumArray(limit));
    }
}
