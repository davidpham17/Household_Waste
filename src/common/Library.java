package common;

import java.util.Scanner;

public class Library {

    private Scanner sc = new Scanner(System.in);

    public String getString(String promt) {
        String s;
        do {
            System.out.print(promt);
            s = sc.nextLine();
        } while (s.equalsIgnoreCase(""));
        return s;
    }

}
