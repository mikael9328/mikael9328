package test203;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String getWinner(Integer aP, Integer bP) {

        String result = "";

        if(aP == bP) {
            result = "D";
        } else  {
            switch (aP) {
                case 1 : if(bP == 2) { result = "B"; } else { result = "A"; } break;
                case 2 : if(bP == 3) { result = "B"; } else { result = "A"; } break;
                case 3 : if(bP == 1) { result = "B"; } else { result = "A"; } break;
                default: break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        Integer limit = in.nextInt();
        ArrayList<Integer> aP = new ArrayList<>();
        ArrayList<Integer> bP = new ArrayList<>();


        for(int i=0; i<limit; i++) { aP.add(in.nextInt()); }
        for(int i=0; i<limit; i++) { bP.add(in.nextInt()); }

        for(int i=0; i < aP.size(); i++) {
            System.out.println(m.getWinner(aP.get(i), bP.get(i)));
        }
    }
}
