package test106;

import java.util.Scanner;

public class Main {

    public String doDistinct(String str) {
        String result = "";
        char[] chrs = str.toCharArray();
        for(char chr : chrs) {
            if(result.indexOf(chr) < 0) {
                result += chr;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(m.doDistinct(str));
    }
}
