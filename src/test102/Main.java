package test102;

import java.util.Scanner;

public class Main {

    public String Solution(String str) {
        //
        String result = "";
        for(char x : str.toCharArray()) {
            //
            if(Character.isLowerCase(x)) {
                //
                result += Character.toUpperCase(x);
            } else {
                result += Character.toLowerCase(x);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //
        Main T = new Main();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.Solution(str));
    }
}


