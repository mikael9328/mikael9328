package test103;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public String solution(String str) {
        //
        String result = "";
        String[] strs = str.split(" ");

//        for(String x : strs) {
//            //
//            if(result.length() < x.length()) {
//                //
//                result = x;
//            }
//        }
//        return result;
        return String.valueOf(Arrays.stream(strs).max(Comparator.comparing(String::length)).get());
    }

    public static void main(String[] args) {
        //
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(m.solution(str));
    }
}
