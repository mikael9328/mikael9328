package test104;

import java.util.Scanner;

public class Main {

    public String reverse(String str) {
        //
        String result = "";
        char[] strs = str.toCharArray();
        char[] tmp = new char[str.length()];

        for(int i=0; i < str.length(); i++) {
            //
            int pos = str.length() - 1 - i;

            tmp[pos] = strs[i];
        }

        for(char x : tmp) {
            //
            result += x;
        }

        return result;
    }

    public static void main(String[] args) {
        //
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        int len = Integer.valueOf(in.next());
        String[] inputs = new String[len];

        for(int i=0 ; i<len ; i++) {
            inputs[i] = in.next();
        }

        for(String str : inputs) {
            //
            System.out.println(m.reverse(str));
        }

    }
}
