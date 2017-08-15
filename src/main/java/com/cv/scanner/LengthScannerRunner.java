package com.cv.scanner;

import java.util.Scanner;

/**
 * Created by alexander.kryvenko on 15.08.2017.
 */
public class LengthScannerRunner {
    public static void main(String args[]) throws Exception {

        ParenthesesScanner calc = new ParenthesesScanner();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer s = sc.nextInt();
            calc.add(s);
        }
        sc.close();

        Integer result = calc.getCount();
        System.out.println(result);
    }
}
