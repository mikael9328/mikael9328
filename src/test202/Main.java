package test202;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String howMany(Integer total, ArrayList<Integer> students) {
        Integer cnt = 1;
        Integer tmpStd = students.get(0);

        for(Integer student : students) {
            if(tmpStd < student) {
                cnt++;
                tmpStd = student;
            }
        }

        return String.valueOf(cnt);
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        Integer limit = in.nextInt();
        ArrayList<Integer> students = new ArrayList<>();

        for(Integer i=0; i<limit; i++) {
            students.add(in.nextInt());
        }

        System.out.println(m.howMany(limit, students));
    }
}
