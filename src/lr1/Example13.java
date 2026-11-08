package lr1;

import java.util.Scanner;

public class Example13 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first num: ");
        int num1 = in.nextInt();

        System.out.println("Input second num: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum: " + sum);
        in.close();
    }
}






