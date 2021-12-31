package test105;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public String reverse(String str) {
        String result = "";
        char[] strs = str.toCharArray();
        char[] tmp = new char[str.length()];

        for(int i=0; i < str.length(); i++) {
            //
            int pos = str.length() - 1 - i;

            if((String.valueOf(strs[i]).getBytes(StandardCharsets.US_ASCII)[0] >= 97
                            && String.valueOf(strs[i]).getBytes(StandardCharsets.US_ASCII)[0] <= 122)
                    || (String.valueOf(strs[i]).getBytes(StandardCharsets.US_ASCII)[0] >= 65
                            && String.valueOf(strs[i]).getBytes(StandardCharsets.US_ASCII)[0] <= 90)) {
                tmp[pos] = strs[i];
            } else {
                tmp[i] =strs[i];
            }
        }

        for(char x : tmp) {
            result += x;
        }

        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        String str = in.next();
//        int len = Integer.valueOf();
//        String[] inputs = new String[len];

//        byte[] bt1 = "a".getBytes(StandardCharsets.US_ASCII);   // 97
//        byte[] bt2 = "z".getBytes(StandardCharsets.US_ASCII);   // 122
//        byte[] bt3 = "A".getBytes(StandardCharsets.US_ASCII);   // 65
//        byte[] bt4 = "Z".getBytes(StandardCharsets.US_ASCII);   // 90
//        System.out.println(bt1[0]);
//        System.out.println(bt2[0]);
//        System.out.println(bt3[0]);
//        System.out.println(bt4[0]);

//        for(int i=0 ; i<len ; i++) {
//            inputs[i] = in.next();
//        }

//        for(String str : inputs) {
            //
            System.out.println(m.reverse(str));
//        }

    }
}
