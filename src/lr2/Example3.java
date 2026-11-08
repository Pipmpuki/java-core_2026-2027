package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input num: ");
        int num = in.nextInt();

        boolean divBy4 = num % 4 == 0;
        boolean notLess10 = num >= 10;

        if (divBy4 && notLess10) {
            System.out.println("The num " + num
                    + " is divisible by 4 and is not less than 10");
        }
        else {
            System.out.println("The num " + num
                    + " does not satisfy the conditions");
            if (!divBy4) {
                System.out.println("It is not divisible by 4: "
                        + "remainder is " + num % 4);
            }
            if (!notLess10) {
                System.out.println("It is less than 10");
            }
        }

        in.close();
    }
}
