package org.example.problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/main/java/org/example/problem1/input.txt"));
        PrintWriter pw = new PrintWriter("src/main/java/org/example/problem1/output.txt");
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (sc.hasNext()) {
            int num = sc.nextInt();
            sum += num;
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        String str = String.valueOf(sum - max) + ' ' + (sum - min);
        pw.print(str);

        sc.close();
        pw.close();
    }
}
