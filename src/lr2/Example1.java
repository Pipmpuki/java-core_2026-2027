package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input num: ");
        int num = in.nextInt();

        if (num % 3 == 0) {
            System.out.println("The num " + num
                    + " is divisible by 3");
        } else {
            System.out.println("The num " + num
                    + " is not divisible by 3");
        }

        in.close();
    }
}
