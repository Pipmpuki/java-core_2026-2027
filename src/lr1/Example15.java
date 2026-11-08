package lr1;

import java.util.Scanner;

public class Example15 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num1: ");
        int num1 = in.nextInt();

        System.out.println("Input num2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int dif = num1 - num2;

        System.out.println("Sum: " + sum);
        System.out.println("Dif: " + dif);
        in.close();
    }
}





