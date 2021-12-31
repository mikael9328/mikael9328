package test101;

import java.util.Scanner;

public class Main {
    //
    public int findChr(String str, char chr) {
        //
        int result = 0;

        for(char x : str.toCharArray()) {
            if(x == Character.toLowerCase(chr)
                    || x == Character.toUpperCase(chr)) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //
        Main t = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char chr = in.next().charAt(0);

        System.out.println(t.findChr(str, chr));

    }
}
