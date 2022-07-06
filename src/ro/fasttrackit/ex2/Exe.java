package ro.fasttrackit.ex2;

import java.util.Scanner;

public class Exe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + 2 * i;
        }
        System.out.println(sum);
    }
}
