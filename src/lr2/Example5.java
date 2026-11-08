package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input num: ");
        long num = in.nextLong();

        long abs = Math.abs(num);
        long thousands = abs / 1000;

        System.out.println("The number contains " + thousands
                + " complete thousands");

        in.close();
    }
}
