package com.cv.document;

import java.util.Scanner;

public class DocumentServiceRunner {

    public static void main(String args[]) throws Exception {

        DocumentService calc = new DocumentService();

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
