package test206;

import java.util.Scanner;

public class Main {

    public Integer getReverseStr(String str) {
        String result = "";
        char[] chr = str.toCharArray();
        for(int j=chr.length-1; j >= 0;j--) {
            result += chr[j];
        }
        return Integer.valueOf(result);
    }

    public boolean isPrime(Integer num) {
        if (num == 1) return false;
        for(int k=2; k<num; k++) {
            if(num%k == 0) {
                return false;
            }
        }
        return true;
    }

    public String getNum(String[] strNum) {

        String result = "";
        for(String str : strNum) {
            Integer tmp = getReverseStr(str);
            if(isPrime(tmp)) {
                result += getReverseStr(str) + " ";
            }
        }

        return result.substring(0, result.length()-1);
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in  = new Scanner(System.in);
        Integer limit = in.nextInt();
        String[] strNum = new String[limit];

        for(int i=0; i<limit; i++) {
            strNum[i] = in.next();
        }

        System.out.println(m.getNum(strNum));
    }
}
